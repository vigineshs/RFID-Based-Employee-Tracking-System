<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Xenther Corp.</title>

<link rel="stylesheet" href="css/style.css">

</head>

<body
	style="background-image: url('images/header1.png'); background-repeat: no-repeat;">

<div id="container">
<div id="heading">
<h1 style="margin-left: 30px;">Company | Leading India</h1>
</div>
<div id="content">
<div id="left-content" style="width: 500px;"><img src="images/togetherness.jpg" style="width:130px; height:130px;" /><p style="margin-top:-100px;margin-left:135px;">The shared focus comes from those who are part of the organisation - senior members of the team pass their knowledge of the team culture to the newer members of the team. This transfer of spirit and culture is a time-honored tradition of our company!</p>
<img src="images/transparency.jpg" style="width:130px; height:130px;" /><p style="margin-top:-100px;margin-left:135px;">Our company is politics-free and completely transparent with respect for skills and knowledge!</p>
<img src="images/line.png"
	style="float: left; margin-left: 450px; margin-top: -250px; height: 400px; width: 180px;"
	alt="" /></div>

<div id="right-content"><br />
<br />
<center>
<h1>Employee Login</h1>
<br />


<form action="http://localhost:8090/TGMC/ForgotPass1" method="post"
	onSubmit="validate()">
<p style="font-size: 24px;">
Enter username &nbsp;<input type="text" size="20" name="uname" /> <br />
<br />
<input type="submit" value="Check 1" style="background-color: #5C92E9; color: #fff;"/></p>
<br />
</form>
<br/>Existing Employee?<a href="http://localhost:8090/TGMC/login.jsp">Login
Here!</a><br />
New Employee? <a href="http://localhost:8090/TGMC/register.jsp">Register
Here!</a>
</center>


<%    
         String username=request.getParameter("uname");   
         session.setAttribute("uname",username);   
    %>
</div>
</div>
<div id="footer">Copyrights Reserved</div>

</div>
</body>
</html>