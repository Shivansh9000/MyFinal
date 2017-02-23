<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<c:set var="prog" value="${requestScope.prog}"/>

<form name="EditProg" action="updateProg.do" method="post">

		<table border="1" align="center">
		
			<tr>
				<td>Enter Program Name</td>
				<td><input type="text" name="programname" value="${sessionScope.programname}"></td>
			</tr>
			
			<tr>
				<td>Enter Description</td>
				<td><input type="text" name="description" value="${prog.description}"></td>
			</tr>
			
			<tr>
				<td>Enter Applicant Eligibility</td>
				<td><input type="text" name="applicanteligibility" value="${prog.applicantEligibility}"></td>
			</tr>
			
			<tr>
	
				<th>Enter Duration</th>
				<td><input type="text" name="duration" value="${prog.duration}"></td>
			</tr>
							
		
			<tr>
				<th>Enter Degree Offered</th>
				<td><input type="text" name="degreeoffered" value="${prog.degreeOffered}"></td>
			</tr>
		
			<tr>
			<td><input  type="submit" value="Update"></td>
			</tr>
			
		</table>	
	</form>
</body>
</html>