<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editing Flight info # ${requestScope.flinfo.flightno}</title>
</head>
<body>

<c:set var="appl" value="${requestScope.appl}"/>

<form name="Edit" action="update.do" method="post">

		<table border="1" align="center">
		
			<tr>
				<td>Enter Application ID</td>
				<td><input type="text" name="applicationid" value="${sessionScope.applicationid}"readonly="readonly"></td>
			</tr>
			
			<tr>
				<td>Enter your full Name</td>
				<td><input type="text" name="fullname" value="${appl.fullName}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<td>Enter Your Date Of Birth</td>
				<td><input type="text" name="dob" value="${appl.dob}" readonly="readonly"></td>
			</tr>
			
			<tr>
	
				<th>Enter your Highest Qualification</th>
				<td><input type="text" name="highestqual" value="${appl.highestQual}" readonly="readonly"></td>
			</tr>
							
		
			<tr>
				<th>Enter Your Marks</th>
				<td><input type="text" name="marks" value="${appl.marks}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>Enter your Goals</th>
				<td><input type="text" name="goals" value="${appl.goals}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>Enter Your EmailId</th>
				<td><input type="text" name="email" value="${appl.emailId}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>Enter Your Scheduled Program Id</th>
				<td><input type="text" name="scheduledProgramId" value="${appl.scheduledProgramId}" readonly="readonly"></td>
			</tr>
			
			<tr>
				<th>Enter your Status</th>
				<td><input type="text" name="status" value="${appl.status}"></td>
			</tr>
			
			<tr>
				<th>Enter your Date of Interview</th>
				<td><input type="text" name="doi" value="${appl.doi}"></td>
			</tr>
			
			
			<tr>
			<td><input  type="submit" value="Update"></td>
			</tr>
			
		</table>	
	</form>
	
</body>
</html>