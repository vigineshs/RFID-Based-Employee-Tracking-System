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
ResultSet rs=st.executeQuery("select * from orgdetails");

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company | Leading India</title>


<link href="styles.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="jquery-1.3.2.min.js"></script>
		<script type="text/javascript" src="jquery.tools.js"></script>
</head>

<body style="background-color: #C3D1E6;">
<div id="container">
<div id="main">
<!-- header begins -->
<div id="header">
	<div id="logo">
    	<a href="index.html" title="Xen Tech"></a>
    </div>
	
    <ul class="menu">
								<li><a class="active" href="index.jsp">Home</a></li>
								<li><a href="faq.html">Support</a></li>
								<li><a class="active" href="login.jsp">Login</a></li>
								<li><a href="staff.html">Location</a></li>
								<li class="last"><a href="contacts.html">Contacts</a></li>
							</ul>
</div>
<!-- header ends -->

					<div class="top">

	<div class="scrollable">
				<div class="items">
					<div class="item">
					  <div class="header">
					  

						         <div class="top_left"><a><img src="images/marketing.jpg" alt="" /></a></div>
								<div class="top_right">
									<h1 style="font-style: italic">Growing your business through 
patterns of expertise</h1><br />
							
								</div>
														
					<div class="clear"></div>
					</div> 
           
					</div> <!-- item -->
					<div class="item">
					    <div class="header">
						
						   <div class="top_left"><a><img src="images/marketing.jpg" alt="" /></a></div>
								<div class="top_right">
									<h1>Designed to accelerate value</h1><br />
									
								</div>
														
					<div class="clear"></div>
	
						
						</div>						
					</div> <!-- item -->
					<div class="item">
					    <div class="header">
						
						   <div class="top_left"><a><img src="images/marketing.jpg" alt="" /></a></div>
								<div class="top_right">
									<h1>As a small businessperson, you have no greater leverage than the truth. </h1><br />
									
								</div>
														
					<div class="clear"></div>
						
						</div>						
					</div> <!-- item -->
					
					<div class="item">
					    <div class="header">
						
						   <div class="top_left"><a><img src="images/marketing.jpg" alt="" /></a></div>
								<div class="top_right">
									<h1>Blessed is he who has found his work; let him ask no other blessedness.</h1><br />
									
								</div>
														
					<div class="clear"></div>
						
						</div>						
					</div> <!-- item -->			
											
					
				</div> <!-- items -->
			</div> <!-- scrollable -->
			<div class="hline"></div>
			<div class="navi"></div> <!-- create automatically the point dor the navigation depending on the numbers of items -->		   
			  
               
</div>   

<div style="clear: both"></div>

        <!-- content begins -->
    <div id="content">

        
            
          

        <div class="line"></div>

        <div>
        
        <div >
            	
            	<h3>"About Us, Company Overview."</h3>
                <div style="float: left; width: 980px; font-size:24px; color: black; font-family: Monotype Corsiva; line-height: 1.2;">
                <% while(rs.next())
	{
	%><%=rs.getString(1)%>
	<%}}
catch(Exception e){out.print(e);} %>
                
            </div>
            </div>
            
            <div style="clear: both;"></div>
        </div>


       
        
          
        
    </div>
    <!-- content ends --> 

<!-- footer begins -->
            <div id="footer">
                    <div class="line"></div> <!-- Do not remove the designed by link or Pay the link removal fee -->
          		<p> Copyrights reserved</p>
		       
  </div>
        <!-- footer ends -->
</div>
</div>

</body>
</html>