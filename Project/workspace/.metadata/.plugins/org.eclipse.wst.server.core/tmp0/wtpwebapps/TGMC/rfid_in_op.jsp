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
<% String username=(String)session.getAttribute("uname"); %>
	
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
</div>


<div id="content">
<center><form action="http://localhost:8090/TGMC/RfidOnOp" method="post" >
<input type="submit" value="get in" />
</form>
</center>
</div>

</body>
</html>