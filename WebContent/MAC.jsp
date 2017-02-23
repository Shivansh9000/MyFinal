<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
 							<th>Update Or Delete Application</th>
 					</tr>
 				
           <c:forEach items="${requestScope.allApplication}" var="app">
				   <tr>
				   		   
				   		   <td>${app.applicationId}</td>
				   		   <td>${app.fullName}</td>
					       <td>${app.dob}</td>
					       <td>${app.highestQual}</td>
					       <td>${app.marks}</td>
					       <td>${app.goals}</td>
					       <td>${app.emailId}</td>
					       <td>${app.scheduledProgramId}</td>
					       <td>${app.status}</td>
					       <td>${app.doi}</td>
					       <td>
		                    	<a href="edit.do?applicationid=<c:out value='${app.applicationId}'/>&status=<c:out value='${app.status}'/>&doi=<c:out value='${app.doi}'/>">Update</a>
		                    	&nbsp;&nbsp;&nbsp;&nbsp;
		                   </td>
				    </tr>
				    
			</c:forEach>
</table>
</body>
</html>