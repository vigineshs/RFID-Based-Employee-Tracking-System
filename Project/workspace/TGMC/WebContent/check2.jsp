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


<form action="http://localhost:8090/TGMC/FinalCheck" method="post"
	onSubmit="validate()">
<p style="font-size: 24px;">
<table>
<tr>
<td>Secret Question</td></tr>
		<tr><td><select name="sq">
			<option value="1">Who is your favorite Actor?</option>
			<option value="2">What is name of the your birth place?</option>
			<option value="3">What is the name of your first teacher?</option>
		</select></td></tr>
		<tr><td>Answer</td></tr>
		<tr><td><input type="text" name="sqans"></td></tr>
<tr> <td>
<input type="submit" value="Check 3" style="background-color: #5C92E9; color: #fff;" /></td></tr></table>

</form>
<br/>Existing Employee?<a href="http://localhost:8090/TGMC/login.jsp">Login
Here!</a><br />
New Employee? <a href="http://localhost:8090/TGMC/register.jsp">Register
Here!</a>
</center>


<%    
String username=(String)session.getAttribute("uname");   
    %>
</div>
</div>
<div id="footer">Copyrights Reserved</div>

</div>
</body>
</html>