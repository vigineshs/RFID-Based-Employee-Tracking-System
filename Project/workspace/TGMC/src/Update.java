
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import javax.servlet.RequestDispatcher;
/**
 * Servlet implementation class for Servlet: Update
 *
 */
 public class Update extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public Update() {
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
	  	String firstname=request.getParameter("fname");
	  	String lastname=request.getParameter("lname");
	  	String age=request.getParameter("age");
	  	
	  	String resaddr=request.getParameter("resaddr");
		String resno=request.getParameter("resno");
		String mobno=request.getParameter("mobno");
		String bankname=request.getParameter("namebank");
		String branchname=request.getParameter("branch");
		String acc1=request.getParameter("acc1");
	  	String acc2=request.getParameter("acc2");
	  	String acc3=request.getParameter("acc3");
		String acc4=request.getParameter("acc4");
		String accno= acc1 + acc2 +acc3 + acc4;
	  	System.out.println(accno);
	  	String department=request.getParameter("dept");
	  	String grade=request.getParameter("grade");
	  	
	  	HttpSession session=request.getSession(true); 
	  	String username=(String)session.getAttribute("uname");
	  	
	  	try{
	  			st=con.createStatement();
	  			System.out.println("UPDATE Details SET (firstname,lastname,age,resaddr,resno,mobno,bankname,branchname,accno) =('"+firstname+"','"+lastname+"','"+age+"','"+resaddr+"','"+resno+"','"+mobno+"','"+ bankname +"','"+branchname+"','"+accno+"') ");
	  	st.executeUpdate("UPDATE Details SET (firstname,lastname,age,resaddr,resno,mobno,bankname,branchname,accno,department,grade) =('"+firstname+"','"+lastname+"','"+age+"','"+resaddr+"','"+resno+"','"+mobno+"','"+ bankname +"','"+branchname+"','"+accno+"','"+department+"','"+grade+"')where username='"+ username+"'");
	  	if(username.equals("viginesh"))
        {
			
 	  	 
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/home_op_out.jsp");
   	 rd.forward(request,response);
        }
		else 
		{
			 
			 RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/home_emp_out.jsp");
	    	 rd.forward(request,response);
		}
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