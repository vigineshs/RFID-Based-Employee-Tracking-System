<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page language="java"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>

<%@ page import="javax.servlet.ServletException"%>
<%@ page import="javax.servlet.http.HttpServlet"%>
<%@ page import="javax.servlet.http.HttpServletRequest"%>
<%@ page import="javax.servlet.http.HttpServletResponse"%>
<%@ page import="javax.servlet.RequestDispatcher"%>

<%


try{
	Connection dbconnection = null;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    dbconnection=DriverManager.getConnection("jdbc:odbc:ets","db2","vicky");
    
  	Statement st;
  	String username=(String)session.getAttribute("uname");  
st= dbconnection.createStatement();
ResultSet rs=st.executeQuery("select * from Details where username='"+ username +"'");

%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company | Leading India</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body
	style="background-image: url('images/header2.png'); background-repeat: no-repeat;">
<div id="container" >
<div id="heading">
<h1 style="margin-left: 30px;">Company | Leading India</h1>


</div>


<div id="emp-left-content"><img src="images/male_user.png" /> <img
	src="images/line1.png"
	style="margin-top: -80px; margin-left: -20px; height: 175px; width: 200px;" />
<br />
<br />
<div id="lmenu" style="margin-top: -80px; margin-left: 20px;">
<ul>

	<li><a href="#"> Update Details</a></li>
	<li><a href="rfid_in.jsp"> Go in</a></li>
	<li><a href="#"> Account Details</a></li>
	<li><a href="http://localhost:8090/TGMC/Logout"  > Log out</a></li>
</ul>
</div>
</div>
<img src="images/line.png"
	style="float: left; margin-left: 70px; margin-top: -420px; height: 550px; width: 200px;" />
<div id="emp-right-content"><% while(rs.next())
	{
	%>
<table>
<tr>
		<td>First Name</td>
		<td><%=rs.getString(1)%> </td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><%=rs.getString(2)%> <br />
		</td>
	</tr>
	<tr>
		<td>Age</td>
		<td><%=rs.getString(3)%></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><%=rs.getString(4)%></td>
	</tr>
	<tr>
		<td>Date of Birth</td>
		<td><%=rs.getString(5)%></td>
	</tr>
<tr>
		<td>Department</td>
		<td><%=rs.getString(18)%></td>
	</tr>
	<tr><td>Grade</td>
		<td><%=rs.getString(19)%></td><tr>
	<tr>
		<td>Email-ID</td>
		<td><%=rs.getString(7)%></td>
	</tr>

		<tr>
		<td>Residential address</td>
		<td><%=rs.getString(10)%></td>
	</tr>

	<tr>
		<td>Residence no.</td>
		<td><%=rs.getString(11)%></td></tr>
		<tr>
		<td>Mobile no.</td>
		<td><%=rs.getString(12)%></td>
	</tr>
	</table>
<%}}
catch(Exception e){out.print(e);} %>
	</div>
</div>

</body>
</html>