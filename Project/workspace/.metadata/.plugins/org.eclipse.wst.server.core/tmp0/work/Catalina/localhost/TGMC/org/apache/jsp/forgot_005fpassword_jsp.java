package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"right-content\"><br />\r\n");
      out.write("<br />\r\n");
      out.write("<center>\r\n");
      out.write("<h1>Employee Login</h1>\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"http://localhost:8080/TGMC/ForgotPass1\" method=\"post\"\r\n");
      out.write("\tonSubmit=\"validate()\">\r\n");
      out.write("<p style=\"font-size: 24px;\">\r\n");
      out.write("Enter username &nbsp;<input type=\"text\" size=\"20\" name=\"uname\" /> <br />\r\n");
      out.write("<br />\r\n");
      out.write("<input type=\"submit\" value=\"Check 1\" style=\"background-color: #5C92E9; color: #fff;\"/></p>\r\n");
      out.write("<br />\r\n");
      out.write("</form>\r\n");
      out.write("<br/>Existing Employee?<a href=\"http://localhost:8080/TGMC/login.jsp\">Login\r\n");
      out.write("Here!</a><br />\r\n");
      out.write("New Employee? <a href=\"http://localhost:8080/TGMC/register.jsp\">Register\r\n");
      out.write("Here!</a>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    
         String username=request.getParameter("uname");   
         session.setAttribute("uname",username);   
    
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">Copyrights Reserved</div>\r\n");
      out.write("\r\n");
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
