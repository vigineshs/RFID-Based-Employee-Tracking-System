

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
 * Servlet implementation class for Servlet: ForgotPass1
 *
 */
 public class ForgotPass1 extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ForgotPass1() {
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
	  	String username=request.getParameter("uname");
	  	System.out.println("username:"+username);
	  	HttpSession session=request.getSession(true); 
	  	session.setAttribute("uname",username);
	  	
	  	try
		{ System.out.println("inside try");
	  	  //st=con.createStatement();
	  	  st=con.createStatement();
	
	  	
	  	
	  	  System.out.println("select * from REGISTER where username='"+username+"'");
	  	  ResultSet rs=st.executeQuery("select * from REGISTER where username='"+username+"'");
	  	
	  	  					  	      
	  	if(rs.next())
	      {
		  	
	  		System.out.println("next");
	  		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/check1.jsp");
	    	 rd.forward(request,response);
		}
	  	else
	  	{
	  		System.out.println("username doesn't Exist!");
		  String mess="<font color='red'>employee ID doesn't Exist!</font>";
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