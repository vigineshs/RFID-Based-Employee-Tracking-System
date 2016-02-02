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

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
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
ResultSet rs=st.executeQuery("select * from orgdetails");


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Company | Leading India</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"jquery.tools.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #C3D1E6;\">\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<!-- header begins -->\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("    \t<a href=\"index.html\" title=\"Xen Tech\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("    <ul class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"active\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"faq.html\">Support</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"active\" href=\"login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"staff.html\">Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"last\"><a href=\"contacts.html\">Contacts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- header ends -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"top\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"scrollable\">\r\n");
      out.write("\t\t\t\t<div class=\"items\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"header\">\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t         <div class=\"top_left\"><a><img src=\"images/marketing.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 style=\"font-style: italic\">Growing your business through \r\n");
      out.write("patterns of expertise</h1><br />\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div> \r\n");
      out.write("           \r\n");
      out.write("\t\t\t\t\t</div> <!-- item -->\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t   <div class=\"top_left\"><a><img src=\"images/marketing.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Designed to accelerate value</h1><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- item -->\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t   <div class=\"top_left\"><a><img src=\"images/marketing.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>As a small businessperson, you have no greater leverage than the truth. </h1><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- item -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t    <div class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t   <div class=\"top_left\"><a><img src=\"images/marketing.jpg\" alt=\"\" /></a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>Blessed is he who has found his work; let him ask no other blessedness.</h1><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div> <!-- item -->\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div> <!-- items -->\r\n");
      out.write("\t\t\t</div> <!-- scrollable -->\r\n");
      out.write("\t\t\t<div class=\"hline\"></div>\r\n");
      out.write("\t\t\t<div class=\"navi\"></div> <!-- create automatically the point dor the navigation depending on the numbers of items -->\t\t   \r\n");
      out.write("\t\t\t  \r\n");
      out.write("               \r\n");
      out.write("</div>   \r\n");
      out.write("\r\n");
      out.write("<div style=\"clear: both\"></div>\r\n");
      out.write("\r\n");
      out.write("        <!-- content begins -->\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("        <div class=\"line\"></div>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("        \r\n");
      out.write("        <div >\r\n");
      out.write("            \t\r\n");
      out.write("            \t<h3>\"About Us, Company Overview.\"</h3>\r\n");
      out.write("                <div style=\"float: left; width: 980px; font-size:24px; color: black; font-family: Monotype Corsiva; line-height: 1.2;\">\r\n");
      out.write("                ");
 while(rs.next())
	{
	
      out.print(rs.getString(1));
      out.write('\r');
      out.write('\n');
      out.write('	');
}}
catch(Exception e){out.print(e);} 
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div style=\"clear: both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- content ends --> \r\n");
      out.write("\r\n");
      out.write("<!-- footer begins -->\r\n");
      out.write("            <div id=\"footer\">\r\n");
      out.write("                    <div class=\"line\"></div> <!-- Do not remove the designed by link or Pay the link removal fee -->\r\n");
      out.write("          \t\t<p> Copyrights reserved</p>\r\n");
      out.write("\t\t       \r\n");
      out.write("  </div>\r\n");
      out.write("        <!-- footer ends -->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
