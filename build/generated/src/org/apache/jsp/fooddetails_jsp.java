package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import foodupload.foodgettersetter;
import foodupload.foodinterImpl;
import foodupload.foodinterface;
import java.util.ArrayList;

public final class fooddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Food Details Page</title>\n");
      out.write("              <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
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
      out.write("    <body style=\"background-color: lightgoldenrodyellow\">\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#F08080\">INDIAN FOOD RESTAURANT</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"ViewProfiles.jsp\">ViewProfiles</a></li>\n");
      out.write("        <li><a href=\"cloud.jsp\">Upload Product</a></li>\n");
      out.write("        <li class=\"active\" style=\"background-color: #f08080\"><a href=\"fooddetails.jsp\">Products Details</a></li>\n");
      out.write("        <li ><a href=\"contactus1.jsp\">Contact Us</a></li>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("        <br><Br>\n");
      out.write("        <h1 style=\"border:1px solid brown; margin: auto; width: 80%; text-align: center;\">Products Details</h1>\n");
      out.write("        <br><BR>\n");
      out.write("        \n");
      out.write("          ");

            foodinterImpl impl = new foodinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        
      out.write("\n");
      out.write("        \n");
      out.write("       ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("value");
      _jspx_th_c_set_0.setValue(list);
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("       <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\"id=\"RegisU\" style=\"width: 80%\" >\n");
      out.write("            \n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white;\">\n");
      out.write("                                        <td style=\"text-align:center; height: 50px\"><b>Image</b></td>\n");
      out.write("                                        <td style=\"text-align:center; height: 50px\"><b>Food Name</b></td>\n");
      out.write("                                        <td style=\"text-align:center; height: 50px\"><b>Food Price</b></td>\n");
      out.write("                                   <td style=\"text-align:center; height: 50px\"><b>Delete</b></td>\n");
      out.write("                                   <td style=\"text-align:center; height: 50px\"><b>Update</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("   \n");
          out.write("                                    <tr bgcolor=\"white\" style=\"color:black;\">\n");
          out.write("                                        <th style=\"width: 20%;\"><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarimage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-responsive\" /></th>\n");
          out.write("                                    <th style=\"text-align:center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                    <th style=\"text-align:center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                    \n");
          out.write("                                    \n");
          out.write("   <th style=\"text-align: center\"><a href=\"DeleteFromDBP?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-danger\">Delete</a></th>\n");
          out.write("   <th style=\"text-align: center\"><a href=\"UpDateP.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-success\">Update</a></th>\n");
          out.write("                      \n");
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
