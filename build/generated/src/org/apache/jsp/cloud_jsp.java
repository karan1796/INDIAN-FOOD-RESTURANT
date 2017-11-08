package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cloud_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Upload Product Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquerys.js\"></script>\n");
      out.write("  <script src=\"js/myscript.js\"></script>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\" />\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                <nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#17A589\">Veggi</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li> <a href=\"ViewProfiles.jsp\">Profiles</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"cloud.jsp\">Upload Products</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!-- User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> Sandeep as Admin</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Registration Button -->\n");
      out.write("\t<li ><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <br><Br>\n");
      out.write("        <h1 style=\"border:1px solid brown; margin: auto; width: 80%; text-align: center;\">Upload Products</h1>\n");
      out.write("        <br><BR>\n");
      out.write("        \n");
      out.write("        <form action=\"foodsupload\" method=\"post\" style=\"margin: auto; width: 80%; text-align: center;\" enctype=\"multipart/form-data\">\n");
      out.write("            <h1 style=\"font-size: 80px;color:black;   \">Food Information</h1>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("\"  name=\"username\">\n");
      out.write("            <input type=\"text\" name =\"name\" class=\"form-control\" placeholder=\"Your Food Name\" required>\n");
      out.write("              <br>\n");
      out.write("              <input type=\"text\" name =\"price\" class=\"form-control\" placeholder=\"Your Food Price\" required>\n");
      out.write("              <br>\n");
      out.write("              <center>\n");
      out.write("\n");
      out.write("                  <input type=\"file\" name=\"image\" class=\"form-control\" style=\"width: 550px;text-align: center\" required>\n");
      out.write("              </center>\n");
      out.write("               <br>\n");
      out.write("            <input type=\"submit\" value=\"Upload it \" class=\"btn btn-danger\" style=\"width: 80px\">\n");
      out.write("        </form> \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
