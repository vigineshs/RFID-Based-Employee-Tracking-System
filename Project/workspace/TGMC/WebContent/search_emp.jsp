<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company | Leading India</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" >
function name1()
{
 var d=document.f1.fname.value;
if(document.f1.fname.value=="")
alert("Enter first name");
  var i;
for(i=0;i<d.length;i++)
  {  
var temp=d.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}}}

function criteria()
{
 var d=document.f1.dept.value;
 var g=document.f1.grade.value;
 var t=document.f1.team.value;
 
if(d=="" && g=="" && t=="" )
alert("Enter any one of the criteria");
  var i;
  
for(i=0;i<d.length;i++)
  {  
var temp=d.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}
}
for(i=0;i<g.length;i++)
  {  
var temp=g.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}
}
for(i=0;i<t.length;i++)
  {  
var temp=t.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}}}

function validate()
{
name1();
criteria();
}

</script>
<% String username=(String)session.getAttribute("uname");  %>
</head>
<body
	style="background-image: url('images/header2.png'); background-repeat: no-repeat;">
<div id="container">
<div id="heading">
<h1 style="margin-left: 30px;">Company | Leading India</h1>

<div id="menu"
	style="float: right; margin-right: 50px; margin-top: -50px;">
<ul>
	<li><a href="home_emp_out.jsp">Home</a></li>
	<li><a href="search_emp.jsp">Search</a></li>
	<li><a href="org_details.jsp">Org. Details</a></li>
	<li><a href="hierarchy.jsp">Hierarchy</a></li>
</ul>
</div>
</div>


<div id="emp-left-content"><img src="images/male_user.png" /> <img
	src="images/line1.png"
	style="margin-top: -80px; margin-left: -20px; height: 175px; width: 200px;" />
<br />
<br />
<div id="lmenu" style="margin-top: -80px; margin-left: 20px;">
<ul>

	<li><a href="update_details.jsp"> Update Details</a></li>
	<li><a href="rfid_out.jsp"> Go out</a></li>
	<li><a href="account_details.jsp"> Account Details</a></li>
	<li><a href="#" onclick="alert('You should go out of reader in order to log out');"> Log out</a></li>
</ul>
</div>
</div>
<img src="images/line.png"
	style="float: left; margin-left: 70px; margin-top: -420px; height: 550px; width: 200px;" />
<div id="emp-right-content">
<h3>Search Employee:</h3>
<form name="f1" action="http://localhost:8090/TGMC/search_results.jsp" method="get" >
<table cellspacing="10">
	<tr>
		<td>Name</td>
		<td><input type="text" size=30 name="fname" /></td>
	</tr>
	<tr>
		<td>Department</td>
		<td><input type="text" size=30 name="dept" /></td>
	</tr>
	<tr>
		<td>Grade</td>
		<td><input type="text" size=30 name="grade" /></td>
	</tr>
	<tr>
		<td>Team Name</td>
		<td><input type="text" size=30 name="team" /></td>
	</tr>
	<tr>
		<td colspan="4">
		<center><input type="submit" value="Search" onfocus="validate()"
			style="background-color: #5C92E9; color: #fff;"  />
			</center>
		</td>
	</tr>
</table>
</form>
</div>
</div>

</body>
</html>