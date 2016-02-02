

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
 * Servlet implementation class for Servlet: FinalCheck
 *
 */
 public class FinalCheck extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public FinalCheck() {
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
	  	int count=0;
	  	HttpSession session=request.getSession(true); 
	  	String username=(String)session.getAttribute("uname");
	  	String sq1=request.getParameter("sq");
	  	String sqans1=request.getParameter("sqans");
	  	try
		{ System.out.println("inside try");
	  	  //st=con.createStatement();
	  	  st=con.createStatement();
	  	
	  	System.out.println("select * from Register where username='"+username+"' ");
	  	  ResultSet rs=st.executeQuery("select * from Register where username='"+username+"'");
	  	if(rs.next())
	  	{	  	  String sq=rs.getString(10);
	  	String sqans=rs.getString(11);
	  	  					  	      
	  	
	  		if(sq.equals(sq1))
	         {
	  			if(sqans.equals(sqans1))
		         {
	  				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/checkpoint.jsp");
	  		    	 rd.forward(request,response);
		         }
	         }
	  		
		}
	  	else
	  	{
	  		System.out.println("Secret answer wrong, Try Again!");
		  String mess="<font color='red'>ecret answer wrong, Try Again!</font>";
		  count++;
		  if(count<5)
          {
		   String link="http://localhost:8090/TGMC/check2.jsp";
          request.setAttribute("link", link);     
          request.setAttribute("mess", mess);    
          
          
    		    RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/message.jsp");
	  	rd.forward(request, response);
	  	}
          else if(count==5)
          {
        	  System.out.println("This is your final try else your account will be blocked!");
    		  mess="<font color='red'>This is your final try else your account will be blocked!</font>";
    		  count++;
    		   String link="http://localhost:8090/TGMC/check2.jsp";
              request.setAttribute("link", link);     
              request.setAttribute("mess", mess); 
              RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/message.jsp");
      	  	rd.forward(request, response);
          }
         
	  	}
		}
	  	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  	}
	}   	  	    
}