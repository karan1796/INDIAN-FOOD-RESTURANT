package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import profiles.Profiles;
import profiles.ProfileDaoIMPl;
import profiles.ProfileDAO;

public final class ViewProfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write(" <head>\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

    ProfileDAO pdao = new ProfileDaoIMPl();
    
   List<Profiles> list = pdao.getProfiles();         
         
   
   request.setAttribute("products", list);
    
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body style=\"background-color: lightgoldenrodyellow\">\n");
      out.write("       \n");
      out.write("        <!--nav bar for admin started -->\n");
      out.write("        \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#F08080\">INDIAN FOOD RESTAURANT</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\" style=\"background-color: #F08080\"><a href=\"ViewProfiles.jsp\">ViewProfiles</a></li>\n");
      out.write("        <li ><a href=\"contactus1.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"A_product.jsp\">Products</a></li>\n");
      out.write("        <li><a href=\"BuyerDetails.jsp\">Buy Details</a></li>\n");
      out.write("        <li><a href=\"cloud.jsp\">Update product</a></li>\n");
      out.write("        <li><a href=\"fooddetails.jsp\">Buy Details</a></li>\n");
      out.write("        <!--li><a href=\"sale_products.jsp\">Upload Details</a></li-->\n");
      out.write("        </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!--Admin User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\">KARAN</b></a></li>\n");
      out.write("          \n");
      out.write("\n");
      out.write("<!-- User Logout Button -->\n");
      out.write("<li ><a href=\"Login .jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--nav bar stoped-->\n");
      out.write("        \n");
      out.write("        <h1 style=\"margin: auto; width: 80%; text-align: center;\">View Profiles </h1><br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\"id=\"RegisU\" style=\"width: 80%\" >\n");
      out.write("            \n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white;\">\n");
      out.write("                                        <td><b>Name</b></td>\n");
      out.write("                                        <td><b>Email-Id</b></td>\n");
      out.write("                                        <td><b>Contact</b></td>\n");
      out.write("<!--                                        <td><b>Password</b></td>-->\n");
      out.write("                                        <td><b>Delete</b></td>\n");
      out.write("                                        <td><b>Update</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("x");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                    \n");
          out.write("                                    <tr bgcolor=\"white\" style=\"color:black; \">\n");
          out.write("                \n");
          out.write("                    \n");
          out.write("                    <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                     <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                      <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                       <th><a href=\"DeleteFromDB?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-danger\">Delete</a></th>\n");
          out.write("                        <th><a href=\"UpDate.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-success\">Update</a></th>\n");
          out.write("                \n");
          out.write("                                    </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
