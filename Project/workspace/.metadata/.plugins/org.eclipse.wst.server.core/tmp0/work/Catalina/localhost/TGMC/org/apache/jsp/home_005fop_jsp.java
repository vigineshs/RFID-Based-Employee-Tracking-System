package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public final class home_005fop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");



try{
	Connection dbconnection = null;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    dbconnection=DriverManager.getConnection("jdbc:odbc:ets","db2","vicky");
    
  	Statement st;
  	String username=(String)session.getAttribute("uname");  
st= dbconnection.createStatement();
ResultSet rs=st.executeQuery("select * from Details where username='"+ username +"'");


      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Company | Leading India</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body\r\n");
      out.write("\tstyle=\"background-image: url('images/header2.png'); background-repeat: no-repeat;\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"heading\">\r\n");
      out.write("<h1 style=\"margin-left: 30px;\">Company | Leading India</h1>\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu\"\r\n");
      out.write("\tstyle=\"float: right; margin-right: 50px; margin-top: -50px;\">\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"home_op.jsp\">Home</a></li>\r\n");
      out.write("\t<li><a href=\"search_op.jsp\">Search</a></li>\r\n");
      out.write("\t<li><a href=\"org_details_op.jsp\">Org. Details</a></li>\r\n");
      out.write("\t<li><a href=\"hierarchy_op.jsp\">Hierarchy</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"emp-left-content\"><img src=\"images/male_user.png\" /> <img\r\n");
      out.write("\tsrc=\"images/line1.png\"\r\n");
      out.write("\tstyle=\"margin-top: -80px; margin-left: -20px; height: 175px; width: 200px;\" />\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<div id=\"lmenu\" style=\"margin-top: -80px; margin-left: 20px;\">\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"#\"> Inbox</a></li>\r\n");
      out.write("\t<li><a href=\"update_details_op.jsp\"> Update Details</a></li>\r\n");
      out.write("\t<li><a href=\"#\"> Account Details</a></li>\r\n");
      out.write("\t<li><a href=\"#\"> Log out</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<img src=\"images/line.png\"\r\n");
      out.write("\tstyle=\"float: left; margin-left: 70px; margin-top: -420px; height: 550px; width: 200px;\" />\r\n");
      out.write("<div id=\"emp-right-content\">");
 while(rs.next())
	{
	
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>First Name</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(1));
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Last Name</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(2));
      out.write(" <br />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Age</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Gender</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Date of Birth</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t<td>Department</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(18));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr><td>Grade</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(19));
      out.write("</td><tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Email-ID</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(7));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td>Residential address</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Residence no.</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(11));
      out.write("</td>\r\n");
      out.write("\t\t<td>Mobile no.</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(12));
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
}}
catch(Exception e){out.print(e);} 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
