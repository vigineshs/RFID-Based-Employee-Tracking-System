<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
ResultSet rs=st.executeQuery("select * from hierarchy");

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company | Leading India</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body
	style="background-image: url('images/header2.png'); background-repeat: no-repeat;">
<div id="container">
<div id="heading">
<h1 style="margin-left: 30px;">Company | Leading India</h1>

<div id="menu"
	style="float: right; margin-right: 50px; margin-top: -50px;">
<ul>
	<li><a href="home_op_out.jsp">Home</a></li>
	<li><a href="search_op.jsp">Search</a></li>
	<li><a href="org_details_op.jsp">Org. Details</a></li>
	<li><a href="hierarchy_op.jsp">Hierarchy</a></li>
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

	<li><a href="update_details_op.jsp"> Update Details</a></li>
	<li><a href="rfid_out_op.jsp"> Go out</a></li>
	<li><a href="account_details_op.jsp"> Account Details</a></li>
	<li><a href="#" onclick="alert('You should go out of reader in order to log out');"> Log out</a></li>
</ul>
</div>
</div>
<img src="images/line.png"
	style="float: left; margin-left: 70px; margin-top: -420px; height: 550px; width: 200px;" />
<div id="emp-right-content">hierarchy details <a
	style="margin-top: 20px; margin-left: 620px; font-size: 16px;"
	href="set_hierarchy.jsp">edit</a> <br />
<% while(rs.next())
	{
	%>
	<table style="font-size:20px;" cellpadding="5">
	<tr> <td > level 1 </td><td colspan="6"> <center><%=rs.getString(1)%></center></td></tr>
	<tr> <td> level 2 </td><td colspan="3"> <center><%=rs.getString(2)%></center></td>
	<td colspan="3"> <center><%=rs.getString(3)%> </center></td></tr>
	<tr> <td > level 3 </td>
	<td colspan="6"> <center><%=rs.getString(4)%></center> </td></tr>
	<tr><td> level 4 </td> <td> <%=rs.getString(5)%> </td>
	<td> <%=rs.getString(6)%></td>
	<td> <%=rs.getString(7)%> </td>
	<td> <%=rs.getString(8)%> </td>
	<td> <%=rs.getString(9)%> </td>
	<td> <%=rs.getString(10)%> </td> </tr>
	
	</table>
	
	<%}
}
catch(Exception e){out.print(e);} %>
</div>
</div>

</body>
</html>