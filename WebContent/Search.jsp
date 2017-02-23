<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
            h4 
		{
		    font-family:verdana, arial, helvetica, sans-serif; 
		    font-size:100%;
		    font-weight:bold; 
		    font-style:normal; 
		    text-decoration:none; 
		    text-transform:none; 
		    margin:0px; 
		    padding:0px;
		    color:#ffffff;
		  	
		}

        
</style>
<body>
        <center>
        
            <form action="viewApplication.do">
                <TABLE BORDER="1" >
                    <TR>
                        <TD> <h4 >Application Id:</h4> </TD>
                        <TD> <input type="text" name="applicationid" /> </TD>
                    </TR>
                    <TR>
                        <TD COLSPAN="2" ALIGN="CENTER"">
                            <input type="submit"  />
                            <input type="reset"  />
                        </TD>
                    </TR>
                </TABLE>
                
            </form>
        </center>
    </body>
</html>