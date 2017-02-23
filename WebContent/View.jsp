<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Status</title>
</head>
<body>
 <table border="2">
 				   <tr>
 							<th>Application ID</th>
 							<th>Applicant's Name</th>
 							<th>Applicant's Date of Birth</th>
 							<th>Applicant's Highest Qualification</th>
 							<th>Applicant's Marks</th>
 							<th>Applicant's Goals</th>
 							<th>Applicant's EmailId</th>
 							<th>Applicant's Scheduled Program Id</th>
 							<th>Applicant's Status</th>
 							<th>Applicant's Date Of Interview</th>
 					</tr>
 				
           
				   <tr>
				   		   
				   		   <td>${applicationid.applicationId}</td>
				   		   <td>${applicationid.fullName}</td>
					       <td>${applicationid.dob}</td>
					       <td>${applicationid.highestQual}</td>
					       <td>${applicationid.marks}</td>
					       <td>${applicationid.goals}</td>
					       <td>${applicationid.emailId}</td>
					       <td>${applicationid.scheduledProgramId}</td>
					        <td>${applicationid.status}</td>
					       <td>${applicationid.doi}</td>
				    </tr>
			
</table>
</body>
</html>