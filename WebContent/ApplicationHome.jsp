<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Home</title>
</head>
<style>
    body
        {
            background:url('image1.jpg') no-repeat center center fixed;
            background-size: cover;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            margin: 0;
            padding: 0;
        }
</style>

<body>
	<h1 align="center">University Admission System</h1>
	<form name="ApplicationHome" action="register.do" method="post">
		<table align="center" border="4" cellpadding="20" bordercolor="red" bgcolor="AntiqueWhite">
			<tr>
				<th>Enter your full Name</th>
				<td><input type="text" name="fullname"></td>
			</tr>
			
			<tr>
				<th>Enter Your Date Of Birth</th>
				<td><input type="text" name="dob"></td>
			</tr>
			
			<tr>
				<th>Enter your Highest Qualification</th>
				<td><input type="text" name="highestqual"></td>
			</tr>
			
			<tr>
				<th>Enter Your Marks</th>
				<td><input type="text" name="marks"></td>
			</tr>
			
			<tr>
				<th>Enter your Goals</th>
				<td><input type="text" name="goals"></td>
			</tr>
			
			<tr>
				<th>Enter Your EmailId</th>
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<th>Enter Your Scheduled Program Id</th>
				<td><input type="text" name="scheduledProgramId"></td>
			</tr>
			
			<tr>
				<th>Enter your Status</th>
				<td><input type="text" name="status"></td>
			</tr>
			
			<tr>
				<th>Enter your Date of Interview</th>
				<td><input type="text" name="doi"></td>
			</tr>
			
		</table>
		<p style="text-align: center;">
		<input type="submit" value="register" name="action">
		</p>
	</form>
	
</body>
</html>