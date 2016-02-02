<%@page import="java.sql.*"%>
<%@page import="javax.servlet.*"%>
<%@page import="java.io.*"%>
<%@page import="javax.sql.*"%>
<%@page language="java"%>
<%
String n=request.getParameter("NAME");
String a=request.getParameter("AGE");
String e=request.getParameter("EMAIL");
String un=request.getParameter("USER_NAME");
String p=request.getParameter("PASSWORD");
String g=request.getParameter("GENDER");
String adr=request.getParameter("ADDRESS");
try
{
	out.print("inside try");
Class.forName("COM.ibm.db2.jdbc.app.DB2Driver");
Connection con=DriverManager.getConnection("jdbc:db2:test","db2admin","db2admin");
Statement stmt=con.createStatement();
ResultSet rs=null;
System.out.println("insert into user_details values('"+n+"',"+a+",'"+e+"','"+un+"','"+p+"','"+g+"','"+adr+"');");
String q1="insert into user_details values('"+n+"',"+a+",'"+e+"','"+un+"','"+p+"','"+g+"','"+adr+"')";
stmt.executeUpdate(q1);
out.print("loaded");
stmt.close();
con.close();
}

catch(Exception ex){ex.printStackTrace();}
%>