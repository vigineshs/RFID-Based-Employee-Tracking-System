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
<h1 style="margin-left: 30px;">Company | Leading India </h1>
</div>
<div id="content">
<div id="left-content" style="width: 500px;"><img src="images/togetherness.jpg" style="width:130px; height:130px;" /><p style="margin-top:-100px;margin-left:135px;">The shared focus comes from those who are part of the organisation - senior members of the team pass their knowledge of the team culture to the newer members of the team. This transfer of spirit and culture is a time-honored tradition of our company!</p>
<img src="images/transparency.jpg" style="width:130px; height:130px;" /><p style="margin-top:-100px;margin-left:135px;">Our company is politics-free and completely transparent with respect for skills and knowledge!</p>
<img src="images/line.png"
	style="float: left; margin-left: 450px; margin-top: -250px; height: 400px; width: 180px;"
	alt="" /></div>

<div id="right-content"><br /><% while(rs.next())
	{
	%>
	<br />
	<br />
	<form action="http://localhost:8090/TGMC/login.jsp">
<table style="font-size: 24px;">
<tr>
		<td>username</td>
		<td><%=rs.getString(8)%> </td>
	</tr>
	<tr>
		<td>Password</td>
		<td><%=rs.getString(9)%> <br />
		</td>
	</tr>
	<tr> <td>
<input type="submit" value="login" id="submit" /></td></tr>
	
	</table>
	</form>
<%}}
catch(Exception e){out.print(e);} %>
	</div>
</div>
</div>
</body>
</html>