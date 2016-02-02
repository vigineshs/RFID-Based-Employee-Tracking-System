

import java.io.IOException;
import java.sql.Connection;

import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: Setorg
 *
 */
 public class Setorg extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public Setorg() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dbconn dbc = Dbconn.getConnection();
	  	Connection con=dbc.getDbconnection();
	  	Statement st;
	  	
	  	HttpSession session=request.getSession(true); 
	  	String username=(String)session.getAttribute("uname");
	  	
	   	String orgdet=request.getParameter("orgdetails");
	  	System.out.println("username:"+orgdet);
	  	  	
	  	try
		{ System.out.println("inside try");
	  	  //st=con.createStatement();
		st=con.createStatement();
	  	st.executeUpdate("UPDATE orgdetails SET (orgdet) ='"+orgdet+"'");
	  	RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/org_details_op.jsp");
   	 rd.forward(request,response);
		}
	  	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  	}
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}   	  	    
}