<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/add.css" type="text/css" media="all">
<link rel="stylesheet" href="css/table1.css" type="text/css" media="all">
<title>Insert title here</title>
</head>

   <!--<style>
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
        
</style>-->

<body>

<form name="Login" action="enter.do" method="post">
		<table class='table1' align="center" style="vertical-align:center" border="4" cellpadding="10" bordercolor="red" bgcolor="Silver">
			<tr>	
				<th>Enter LoginId:</th>
				<td><input type="text" name="loginid" required></td>
			</tr>
			
			<tr>
				<th>Enter Password:</th>
				<td><input type="password" name="password" required></td>
			</tr>
			<th colspan="2">
			<input type="submit" value="Login" required>
			</th>			
		</table>
</form>
</body>
</html>