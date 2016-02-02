

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class signup
 */
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Dbconn dbc = Dbconn.getConnection();
	  	Connection con=dbc.getDbconnection();
	  	Statement st;
	  	String firstname=request.getParameter("fname");
	  	String lastname=request.getParameter("lname");
	  	String age=request.getParameter("age");
	  	String gender=request.getParameter("gender");
	  	String day=request.getParameter("day");
	  	String month=request.getParameter("month");
	  	String year=request.getParameter("year");
	  	String dob= month + "/" + day + "/" + year;
	  	System.out.println(dob);
	  	
	  	String empid=request.getParameter("empid");
	  	String emailid=request.getParameter("mail");
	  	String username=request.getParameter("uname");
	  	String password=request.getParameter("password");
		String repassword=request.getParameter("password1");
				String sq=request.getParameter("sq");
	  	String sqans=request.getParameter("sqans");
	  	String mess="";
	  	String link="";
	  	try
		{
			System.out.println("inside try");
		    st=con.createStatement();  
		    
		    ResultSet rs=st.executeQuery("select * from Register where username='"+username+"'");
		    if(rs.next())
		    {
		    	System.out.println("Username already exists.");
 			    mess="Username already exists. Click Ok to Register again with a different username.";
 			    link="http://localhost:8090/TGMC/register.jsp";
 				  	    }
		    
		    
		    else
		    {
		    	ResultSet es=st.executeQuery("select * from Register where emailid='"+emailid+"'");
		    	if(es.next())
		    	{
			    	System.out.println("Hello'" + firstname +"'You've already registered. Try Logging ");
	 			    mess="Hello" + firstname +"You've already registered. Try Logging ";
	 			    link="http://localhost:8090/TGMC/login.jsp";
	 				  	    }
		    	else
		    	{
		    		ResultSet ems=st.executeQuery("select * from Register where empid='"+empid+"'");
			    	if(ems.next())
			    	{
				    	System.out.println("Hello'" + firstname +"'You've already registered. Try Logging ");
		 			    mess="Hello" + firstname +"You've already registered. Try Logging ";
		 			    link="http://localhost:8090/TGMC/login.jsp";
		 				  	    }
			    	else
			    	{
		    System.out.println("INSERT into REGISTER values('"+firstname+"','"+lastname+"','"+age+"','"+gender+"','"+dob+"','"+empid+"','"+emailid+"','"+username+"','"+password+"','"+sq+"','"+sqans+"');");
		    st.executeUpdate("INSERT into REGISTER values('"+firstname+"','"+lastname+"','"+age+"','"+gender+"','"+dob+"','"+empid+"','"+emailid+"','"+username+"','"+password+"','"+sq+"','"+sqans+"');");
		    st.executeUpdate("INSERT into DETAILS values('"+firstname+"','"+lastname+"','"+age+"','"+gender+"','"+dob+"','"+empid+"','"+emailid+"','"+username+"','"+password+"',' ',' ',' ',' ',' ',' ','"+sq+"','"+sqans+"',' ',' ',' ');");
		    System.out.println("Register succes");     
		    
		    System.out.println("Gethu");
			   mess="Registration Successful. Click Ok to Login.";
			   link="http://localhost:8090/TGMC/login.jsp";
			    	}
		    	}
			}
		 }
	  	
	  	catch(Exception e)
		{
			e.printStackTrace();
		}
		    request.setAttribute("mess", mess);    
		  	
		    
	     request.setAttribute("link", link);     
	     request.setAttribute("id",username);
	     
	     RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/message.jsp");
		  	rd.forward(request, response);	
		
	}
	
	
	
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
