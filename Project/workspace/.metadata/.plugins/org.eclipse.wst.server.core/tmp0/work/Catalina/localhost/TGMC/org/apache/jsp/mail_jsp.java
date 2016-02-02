package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.naming.*;
import javax.mail.internet.*;
import com.sun.mail.smtp.*;
import java.util.*;
import javax.mail.*;
import javax.activation.*;
import java.sql.*;
import java.text.*;
import java.text.SimpleDateFormat;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Mail</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

try{
  Session mailSession = Session.getInstance(System.getProperties());
  Transport transport = new SMTPTransport(mailSession,new URLName("localhost"));
  transport.connect("localhost",25,null,null);
  MimeMessage m = new MimeMessage(mailSession);
  m.setFrom(new InternetAddress(
request.getParameter("from")
));
  Address[] toAddr = new InternetAddress[] {
  new InternetAddress(
request.getParameter("to")
)
  };
  m.setRecipients(javax.mail.Message.RecipientType.TO, toAddr );
  m.setSubject(
request.getParameter("subject")
);
  m.setSentDate(new java.util.Date());
  m.setContent(
request.getParameter("description")
, "text/plain");
  transport.sendMessage(m,m.getAllRecipients());
  transport.close();
  out.println("Thanks for sending mail!");
}
catch(Exception e){
  out.println(e.getMessage());
  e.printStackTrace();
}

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
