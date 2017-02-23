package com.cg.uas.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;



import java.util.ArrayList;
import java.util.Date;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.uas.bean.Application;
import com.cg.uas.bean.ProgramsOffered;
import com.cg.uas.dao.ApplicantDAOImpl;
import com.cg.uas.exception.ApplicationException;
import com.cg.uas.service.ApplicantServiceImpl;
import com.cg.uas.service.IApplicantService;
import com.cg.uas.util.DbUtil;

@WebServlet("*.do")
public class ApplicantController extends HttpServlet 
{
		private IApplicantService appService = null;
		PreparedStatement pstm = null;
	
	//init block
	@Override
	public void init() throws ServletException {
		appService = new ApplicantServiceImpl();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection conn = null;
		String action = request.getServletPath();
		System.out.println(action);
		Application app = null;
		ProgramsOffered prog = null;
		HttpSession session = request.getSession();
		switch (action)
		{
		case "/login.do":
					RequestDispatcher view = request.getRequestDispatcher("Login.jsp");
					view.forward(request, response);
		break;
		case "/enter.do":
					
					String loginid = request.getParameter("loginid");
					String password = request.getParameter("password");
					System.out.println(loginid);
					System.out.println(password);
					
			try
			{
				conn = DbUtil.getConnection();
				String query = "select role from users where login_id=? and password=?";
				pstm = conn.prepareStatement(query);
				pstm.setString(1, loginid);
				pstm.setString(2, password);
				ResultSet res = pstm.executeQuery();
			
				String role = null;
				
				if (res.next())
					{
						role=res.getString("role");
					}
				
							System.out.println(role);
						if(role==null || role.equals(""))
							{
								response.sendRedirect("Login.jsp");
							}
				
						else if(role.equals("mac"))
						{
							ArrayList<Application> allApplication = appService.getAllApplications();
							request.setAttribute("allApplication", allApplication);
							RequestDispatcher rd2 = request.getRequestDispatcher("MAC.jsp");
							rd2.forward(request, response);
						}
						else if(role.equals("admin"))
						{
							ArrayList<ProgramsOffered> allPrograms = appService.getAllPrograms();
							request.setAttribute("allPrograms", allPrograms);
							RequestDispatcher rd3 = request.getRequestDispatcher("admin.jsp");
							rd3.forward(request, response);
							
							System.out.println(allPrograms);
						}
						return;
						
			}
			catch (NamingException | SQLException e1)
			{
				e1.printStackTrace();
			}
			break;				
		case "/register.do":
			
					String fullname = request.getParameter("fullname");
					String dob1 = request.getParameter("dob");
					String highestqual = request.getParameter("highestqual");
					Double marks = Double.parseDouble(request.getParameter("marks"));
					String goals = request.getParameter("goals");
					String email = request.getParameter("email");
					String scheduledProgramId = request.getParameter("scheduledProgramId");
					String status = request.getParameter("status");
					String doi1 = request.getParameter("doi");
			
					
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				
			try {
				Date dob = formatter.parse(dob1);
				java.sql.Date dateSql = new java.sql.Date(dob.getTime());

				Date doi = formatter.parse(doi1 );
				java.sql.Date dateSql1 = new java.sql.Date(doi.getTime());


				app = new Application();

				app.setFullName(fullname);
				app.setDob(dateSql);
				app.setHighestQual(highestqual);
				app.setMarks(marks);
				app.setGoals(goals);
				app.setEmailId(email);
				app.setScheduledProgramId(scheduledProgramId);
				app.setStatus(status);
				app.setDoi(dateSql1);
				



                 int id = appService.addApplicant(app);
			}
			catch (ParseException | ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				request.getSession().setAttribute("app", app);
			
			RequestDispatcher rd = request.getRequestDispatcher("ApplicationHome.jsp");//dispatching to next page
			rd.forward(request, response);
			
			break;

		case "/viewApplication.do":
			
			try 
			{
					int applicationid  = Integer.parseInt(request.getParameter("applicationid"));
				    app = new Application();
				    app=appService.viewApplication(applicationid);
				    app.setApplicationId(applicationid);
				    System.out.println(app);
				    request.setAttribute("applicationid",app);
				    RequestDispatcher rd1 = request.getRequestDispatcher("View.jsp");
				    rd1.forward(request, response);
			} 
			catch (NumberFormatException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		  break;
		  
		case"/edit.do":
			String applicationid = request.getParameter("applicationid");
			session.setAttribute("applicationid", applicationid);
			System.out.println(applicationid);
			String error;
			if (applicationid!=null) 
				{
			
					int applicationid1=Integer.parseInt(applicationid);
					Application appl = appService.viewApplication(applicationid1);
					request.setAttribute("appl", appl);
					RequestDispatcher view3 = request.getRequestDispatcher("Edit.jsp");
					view3.forward(request, response);
					System.out.println(applicationid1);
				}
			else
				{
					error = "Cannot search Application";
				}
			
			break;
			
			
		case "/update.do":
			
			String applicationid1=(String) session.getAttribute("applicationid");
			String fullName = request.getParameter("fullname");
			String Dob = request.getParameter("dob");
			String highestQual = request.getParameter("highestqual");
			String Marks = request.getParameter("marks");
			String Goals = request.getParameter("goals");
			String emailid = request.getParameter("email");
			String ScheduledProgramId = request.getParameter("scheduledProgramId");
			String Status = request.getParameter("status");
			String Doi = request.getParameter("doi");
	
			System.out.println("hua update");
			
			SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
	
			try 
			
				{
						Date dob = formatter1.parse(Dob);
						java.sql.Date dobSql = new java.sql.Date(dob.getTime());
				
						Date doi = formatter1.parse(Doi);
						java.sql.Date doiSql = new java.sql.Date(doi.getTime());
						
						app = new Application();
			
		        		app.setApplicationId(Integer.parseInt(applicationid1));
						app.setFullName(fullName);
						app.setDob(dobSql);
						app.setHighestQual(highestQual);
						app.setMarks(Double.parseDouble(Marks));
						app.setGoals(Goals);
						app.setEmailId(emailid);
						app.setScheduledProgramId(ScheduledProgramId);
						
						app.setStatus(Status);
						app.setDoi(doiSql);
						System.out.println(dobSql);
						System.out.println(doiSql);
						System.out.println(Status);
						
						appService.update(app);
					
				} 
					catch (ParseException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
								
			RequestDispatcher rd3 = request.getRequestDispatcher("index.jsp");
			rd3.forward(request, response);
		        
							
			break;
			
		case"/editProg.do":
			System.out.println("here i am");
			String programname = request.getParameter("programname");
			session.setAttribute("programname", programname);
			System.out.println(programname);
			String error1;
			if (programname!=null) 
				{
					prog = appService.viewProgram(programname);
					request.setAttribute("prog", prog);
					RequestDispatcher view4 = request.getRequestDispatcher("EditProg.jsp");
					view4.forward(request, response);
					
				}
			else
				{
					error1 = "Cannot search Application";
				}
			
			break;

		case "/updateProg.do":

			System.out.println("updating");
			String programName = (String) session.getAttribute("programname");
			String description = request.getParameter("description");
			String applicantEligibility = request.getParameter("applicanteligibility");
			String duration = request.getParameter("duration");
			String degreeOffered = request.getParameter("degreeoffered");
			
			
			System.out.println("******************************************************************");
			
			System.out.println(programName);
			System.out.println(description);
			System.out.println(applicantEligibility);
			System.out.println(duration);
			System.out.println(degreeOffered);
			System.out.println("******************************************************************");
			try {
				prog = new ProgramsOffered();
				
				prog.setProgramName(programName);
				prog.setDescription(description);
				prog.setApplicantEligibility(applicantEligibility);
				prog.setDuration(Integer.parseInt(duration));
				prog.setDegreeOffered(degreeOffered);
				
				appService.update(prog);
			} 
			catch (NumberFormatException e) 
			{
				
				e.printStackTrace();
			}
			RequestDispatcher rd4 = request.getRequestDispatcher("index.jsp");
			rd4.forward(request, response);
			break;
		
		}
		
		
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
