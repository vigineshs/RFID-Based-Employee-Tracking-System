

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: ForgotPass
 *
 */
 public class ForgotPass extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ForgotPass() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dbconn dbc = Dbconn.getConnection();
	  	Connection con=dbc.getDbconnection();
	  	Statement st;
	  	HttpSession session=request.getSession(true); 
	  	String username=(String)session.getAttribute("uname");
	  	String empid1=request.getParameter("empid");
	  	try
		{ System.out.println("inside try");
	  	  //st=con.createStatement();
	  	  st=con.createStatement();
	  	  ResultSet rs=st.executeQuery("select * from REGISTER where username='"+username+"'");
	  	
	  	  					  	      
	  	if(rs.next())
	      {
	  		String firstname=rs.getString(1);
	  		String empid=rs.getString(6);
		  	if(empid.equals(empid1))
		  	{
	  		System.out.println("next");
	  		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/check2.jsp");
	    	 rd.forward(request,response);
		  	}
		
	  	else 
	  	{
	  		  String mess="<font color='red'>Hello "+firstname+"! This is not your employee ID </font>";
			   String link="http://localhost:8090/TGMC/check1.jsp";
	          request.setAttribute("link", link);     
	          request.setAttribute("mess", mess);     
	          
	    		    RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/message.jsp");
		  	rd.forward(request, response);
	  	}
	      }
	  	else
	  	{
	  	  String mess="<font color='red'>First enter your username!!</font>";
		   String link="http://localhost:8090/TGMC/forgot_password.jsp";
        request.setAttribute("link", link);     
        request.setAttribute("mess", mess);     
        
  		    RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/message.jsp");
	  	rd.forward(request, response);
	  	}
	  	
	      }
	  	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  	}
	  	
	}   	  	    
}