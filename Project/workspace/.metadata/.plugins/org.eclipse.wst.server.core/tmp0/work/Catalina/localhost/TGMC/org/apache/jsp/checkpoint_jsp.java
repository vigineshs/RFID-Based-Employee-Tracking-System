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

public final class checkpoint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Xenther Corp.</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body\r\n");
      out.write("\tstyle=\"background-image: url('images/header1.png'); background-repeat: no-repeat;\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"heading\">\r\n");
      out.write("<h1 style=\"margin-left: 30px;\"><img src=\"images/xenther-logo.png\" style=\"width:150px; height:100px\" />Xenther Corp. </h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<div id=\"left-content\" style=\"width: 500px;\"><img src=\"images/togetherness.jpg\" style=\"width:130px; height:130px;\" /><p style=\"margin-top:-100px;margin-left:135px;\">The shared focus comes from those who are part of the organisation - senior members of the team pass their knowledge of the team culture to the newer members of the team. This transfer of spirit and culture is a time-honored tradition of our company!</p>\r\n");
      out.write("<img src=\"images/transparency.jpg\" style=\"width:130px; height:130px;\" /><p style=\"margin-top:-100px;margin-left:135px;\">Our company is politics-free and completely transparent with respect for skills and knowledge!</p>\r\n");
      out.write("<img src=\"images/line.png\"\r\n");
      out.write("\tstyle=\"float: left; margin-left: 450px; margin-top: -250px; height: 400px; width: 180px;\"\r\n");
      out.write("\talt=\"\" /></div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"right-content\"><br />");
 while(rs.next())
	{
	
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<form action=\"http://localhost:8080/TGMC/login.jsp\">\r\n");
      out.write("<table style=\"font-size: 24px;\">\r\n");
      out.write("<tr>\r\n");
      out.write("\t\t<td>username</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(8));
      out.write(" </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Password</td>\r\n");
      out.write("\t\t<td>");
      out.print(rs.getString(9));
      out.write(" <br />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr> <td>\r\n");
      out.write("<input type=\"submit\" value=\"login\" id=\"submit\" /></td></tr>\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
}}
catch(Exception e){out.print(e);} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
