

import java.io.IOException;
import java.sql.Connection;

import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: Sethierarchy
 *
 */
 public class Sethierarchy extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public Sethierarchy() {
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
	  	
	   	String post1=request.getParameter("post1");
		String post2=request.getParameter("post2");
		String post3=request.getParameter("post3");
		String post4=request.getParameter("post4");
		String post5=request.getParameter("post5");
		String post6=request.getParameter("post6");
		String post7=request.getParameter("post7");
		String post8=request.getParameter("post8");
		String post9=request.getParameter("post9");
		String post10=request.getParameter("post10");
	  
	  	
		HttpSession session=request.getSession(true); 
	  	String username=(String)session.getAttribute("uname");
	  	
	  	  	
	  	try
		{ System.out.println("inside try");
	  	  //st=con.createStatement();
		st=con.createStatement();
		
			
	st.executeUpdate("UPDATE Hierarchy SET (post1,post2,post3,post4,post5,post6,post7,post8,post9,post10) =('"+post1+"','"+post2+"','"+post3+"','"+post4+"','"+post5+"','"+post6+"','"+post7+"','"+ post8 +"','"+post9+"','"+post10+"')");
	System.out.println("UPDATE Hierarchy SET (post1,post1,post1,post1,post1,post1,post1,post1,post1,post1) =('"+post1+"','"+post2+"','"+post3+"','"+post4+"','"+post5+"','"+post6+"','"+post7+"','"+ post8 +"','"+post9+"','"+post10+"')");
	RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/hierarchy_op.jsp");
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