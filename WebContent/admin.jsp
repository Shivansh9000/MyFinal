<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" cellpadding="10">
 				   <tr>
 							<th>Program Name</th>
 							<th>Description</th>
 							<th>Applicant Eligibility</th>
 							<th>Duration</th>
 							<th>Degree Offered</th>
 							
 					</tr>
 				
           <c:forEach items="${requestScope.allPrograms}" var="progOff">
				   <tr>
				   		   
				   		   <td>${progOff.programName}</td>
				   		   <td>${progOff.description}</td>
					       <td>${progOff.applicantEligibility}</td>
					       <td>${progOff.duration}</td>
					       <td>${progOff.degreeOffered}</td>
					     
					     
		                   <td> <a href="editProg.do?programname=<c:out value='${progOff.programName}'/>&description=<c:out value='${progOff.description}'/>&applicantEligibility=<c:out value='${progOff.applicantEligibility}'/>&duration=<c:out value='${progOff.duration}'/>&degreeOffered=<c:out value='${progOff.degreeOffered}'/>">Update</a></td>
		                   <td><a href="delete.do?applicationid=<c:out value='${app.applicationId}'/>&status=<c:out value='${app.status}'/>&doi=<c:out value='${app.doi}'/>">Delete</a></td>
		                    	
		                 
				    </tr>
				    
			</c:forEach>
</table>
</body>
</html>