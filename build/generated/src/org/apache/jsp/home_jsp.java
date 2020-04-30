package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("       <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Home Page</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      ");

       String username=(String)session.getAttribute("username");
        if(username==null || username.trim().equals(""))
        {
            response.sendRedirect("index.html");
        }
        
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"main\"><!-- start header -->\n");
      out.write("<div id=\"header\">\n");
      out.write(" <div id=\"logo\">\n");
      out.write("\t<h1><a href=\"#\">Global Mailing System</a></h1>\n");
      out.write("\t<h2>An Initiative for Easy Mailing Services...</a></h2>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"compose.jsp\">Compose Mail</a></li>\n");
      out.write("\t\t\t<li><a href=\"inbox.jsp\">Inbox</a></li>\n");
      out.write("\t\t\t<li><a href=\"logout.jsp\">Log out</a></li>\n");
      out.write("\t\t\t<li><a href=\"contacts.jsp\">Contact</a></li>\n");
      out.write("\t</div>\t\n");
      out.write("<!-- end header -->\n");
      out.write("</div>\n");
      out.write("<hr />\n");
      out.write("<!-- start page -->\n");
      out.write("<div id=\"page\">\n");
      out.write("\t<!-- start content -->\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<div class=\"post\">\n");
      out.write("\t\t\t<h1 class=\"title\"><a href=\"#\">Welcome to Our Website</a></h1>\n");
      out.write("\t\t\t<div class=\"entry\">\n");
      out.write("\t\t\t<p>Hi! This is <strong>Mail Services</strong>provided by Global Mailing system</a>.\n");
      out.write("\t\t\tYou can perform all email operation like \n");
      out.write("                        <ul>\n");
      out.write("                            <li> sending</li>\n");
      out.write("                            <li>receiving</li>\n");
      out.write("                            <li> deleting</li></ul><br>Currently it stores the information in database\n");
      out.write("                                it's free of cost.</p>\n");
      out.write("\t\t\t  <br><br><br><br><br><br>    \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end content -->\n");
      out.write("\t<!-- start sidebar two -->\n");
      out.write("\t<div id=\"sidebar2\" class=\"sidebar\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>\n");
      out.write("                            <h2>User Details</h2><br>\n");
      out.write("                                <img src=\"css/images/uface.png\" height=\"100px\" weight=\"100px\" alt=\"no\"></img><br>\n");
      out.write("                                    <h3>");
      out.print( username);
      out.write("</</h3><br>\n");
      out.write("                                        ");

                                            String name=(String)session.getAttribute("name");
                                            String gender=(String)session.getAttribute("gender");
                                            String country=(String)session.getAttribute("country");
                                            
                                            
      out.write("\n");
      out.write("                                      \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end sidebar two -->\n");
      out.write("\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("<!-- end page -->\n");
      out.write("<hr />\n");
      out.write("<!-- start footer -->\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p>Copyright &copy; 2008. <a href=\"#\">Privacy Policy</a> | <a href=\"#\">Terms of Use</a> | <a href=\"http://validator.w3.org/check/referer\" title=\"This page validates as XHTML 1.0 Transitional\"><abbr title=\"eXtensible HyperText Markup Language\">XHTML</abbr></a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" title=\"This page validates as CSS\"><abbr title=\"Cascading Style Sheets\">CSS</abbr></a></p> \n");
      out.write("\t<p>Design by <a href=\"http://www.metamorphozis.com/\" title=\"Free Site Templates\">Free Site Templates</a>, coded by <a href=\"http://www.flashtemplatesdesign.com\" title=\"Free Flash Templates\">Free Flash Templates</a>\n");
      out.write("\t\t</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- end footer -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("       ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
