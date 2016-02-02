import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class for Servlet: Logout
 *
 */
 public class Logout extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
* @see javax.servlet.http.HttpServlet#HttpServlet()
*/
public Logout() {
super();
}  
/* (non-Java-doc)
* @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub

// get current session, and don't create one if it doesn't exist
  HttpSession theSession = request.getSession( false );

  // print out the session id
  if( theSession != null ) {
   
    synchronized( theSession ) {
      // invalidating a session destroys it
      theSession.invalidate();
      RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/login.jsp");
    rd.forward(request,response);
 
    }
  }
}  
/* (non-Java-doc)
* @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
}        
}