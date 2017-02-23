package com.cg.uas.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;






import com.cg.uas.bean.Application;
import com.cg.uas.bean.ProgramsOffered;
import com.cg.uas.exception.ApplicationException;
import com.cg.uas.util.DbUtil;

public class ApplicantDAOImpl implements IApplicantDAO
{
	
	Connection conn = null;
	PreparedStatement pstm = null;
	private static final String query= "Insert into application values(?,?,?,?,?,?,?,?,?,?)";
	private static final String APPID_query = "SELECT SEQ_APPID.NEXTVAL FROM DUAL";
	
	@Override
	public int addApplicant(Application app) throws ApplicationException
	{
		int status = 0;
		int applicationId = generateAppId();
		app.setApplicationId(applicationId);
		System.out.println(applicationId);
		try {
			conn=DbUtil.getConnection();
			pstm=conn.prepareStatement(query);
			
			pstm.setInt(1, applicationId);
			pstm.setString(2, app.getFullName());
			pstm.setDate(3, app.getDob());
			pstm.setString(4, app.getHighestQual());
			pstm.setDouble(5, app.getMarks());
			pstm.setString(6, app.getGoals());
			pstm.setString(7, app.getEmailId());
			pstm.setString(8, app.getScheduledProgramId());
			pstm.setString(9, app.getStatus());
			pstm.setDate(10, (Date) app.getDoi());
	
			status=pstm.executeUpdate();
			
			if (status == 0) 
			{
			
				throw new ApplicationException("Problem In Insertion");
			}
		} 
		catch (NamingException | SQLException e) 
		{
			
			e.printStackTrace();
			throw new ApplicationException(e.getMessage());
		}
		
		finally 
		{
			try {
				if (conn != null) 
				{

					pstm.close();
					conn.close();
				}
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}


		}


		return applicationId;

	}

	@Override
	public int generateAppId() throws ApplicationException
	{
		int appId = 0;
		try 
		{
			conn = DbUtil.getConnection();
			pstm = conn.prepareStatement(APPID_query);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next())
			{
				appId = rs.getInt(1);
			}
			
			
		}
		
		catch (NamingException e) 
		{
			
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		return appId;
		
	}

	@Override
	public Application viewApplication(int applicationid) 
	{
		Application app = null;
	
	
		try {
			conn = DbUtil.getConnection();
			String query1= "select * from application where application_id=?";
			pstm = conn.prepareStatement(query1);
			pstm.setInt(1, applicationid);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) 
			{
			
				app = new Application();
				app.setFullName(rs.getString("full_name"));
				app.setDob(rs.getDate("date_of_birth"));
				app.setHighestQual(rs.getString("highest_qualification"));
				app.setMarks(rs.getDouble("marks_obtained"));
				app.setGoals(rs.getString("goals"));
				app.setEmailId(rs.getString("email_id"));
				app.setScheduledProgramId(rs.getString("scheduled_program_id"));
				app.setStatus(rs.getString("status"));
				app.setDoi(rs.getDate("date_of_interview"));
				
			}
		} 
		catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return app;
	}

	@Override
	public ArrayList<Application> getAllApplications()
	{
		ArrayList<Application> appList = null ;
		try 
		{

			appList =  new ArrayList<>();
			conn = DbUtil.getConnection();
			String query2 = "select * from application";
			pstm = conn.prepareStatement(query2);
			ResultSet rs = pstm.executeQuery();
			
			Application app = null;
			while(rs.next())
			{
				app = new Application();
				app.setApplicationId(rs.getInt(1));
				app.setFullName(rs.getString(2));
				app.setDob(rs.getDate(3));
				app.setHighestQual(rs.getString(4));
				app.setMarks(rs.getDouble(5));
				app.setGoals(rs.getString(6));
				app.setEmailId(rs.getString(7));
				app.setScheduledProgramId(rs.getString(8));
				app.setStatus(rs.getString(9));
				app.setDoi(rs.getDate(10));
				
				appList.add(app);
			}
		}
		catch (NamingException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appList;
	}

	@Override
	public void update(Application app) 
	{
		try
		{
			conn=DbUtil.getConnection();
			String query3 ="update application set status=?,date_of_interview=? where application_id=?";
			pstm=conn.prepareStatement(query3);
			
			pstm.setString(1, app.getStatus());
			pstm.setDate(2, app.getDoi());
			pstm.setInt(3, app.getApplicationId());
			pstm.executeUpdate();
			
		} 
		catch (NamingException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public ArrayList<ProgramsOffered> getAllPrograms()
	{
		System.out.println("admin aayaa");
		ArrayList<ProgramsOffered> proList = null;
		try 
		{

			proList =  new ArrayList<>();
			conn = DbUtil.getConnection();
			String query4 = "select * from programs_offered";
			pstm = conn.prepareStatement(query4);
			ResultSet rs = pstm.executeQuery();
			
			ProgramsOffered progOff = null;
			while(rs.next())
			{
				progOff = new ProgramsOffered();
			
				progOff.setProgramName(rs.getString(1));
				progOff.setDescription(rs.getString(2));
				progOff.setApplicantEligibility(rs.getString(3));
				progOff.setDuration(rs.getInt(4));
				progOff.setDegreeOffered(rs.getString(5));
				
				proList.add(progOff);
			}
			
			System.out.println(proList);
		}
		catch (NamingException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proList;
		
	
	}
	public void update(ProgramsOffered prog)
	{
		System.out.println("daoo aagyaa");

		try
		{
			conn=DbUtil.getConnection();
			String query5 ="update programs_offered set program_name=?,description=?,applicant_eligibilty=?,duration=?,degree_certificate_offered=? where program_name=?";
			pstm=conn.prepareStatement(query5);
			
			pstm.setString(1, prog.getProgramName());
			pstm.setString(2, prog.getDescription());
			pstm.setString(3, prog.getApplicantEligibility());
			pstm.setInt(4, prog.getDuration());
			pstm.setString(5, prog.getDegreeOffered());
			System.out.println(prog);
			System.out.println("kyaa ho rha hai");
		} 
		catch (NamingException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public ProgramsOffered viewProgram(String programName) 
	{
		ProgramsOffered prog  = null;
	
		System.out.println("dao mein aaya to hai");
		try {
			conn = DbUtil.getConnection();
			String query6= "select * from programs_offered where program_name=?";
			pstm = conn.prepareStatement(query6);
			pstm.setString(1, programName);
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) 
			{
			
		
				prog = new ProgramsOffered();
				
				prog.setProgramName(rs.getString(1));
				prog.setDescription(rs.getString(2));
				prog.setApplicantEligibility(rs.getString(3));
				prog.setDuration(rs.getInt(4));
				prog.setDegreeOffered(rs.getString(5));
				
				System.out.println(programName);
			}
		} 
		catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prog;
	}
}
