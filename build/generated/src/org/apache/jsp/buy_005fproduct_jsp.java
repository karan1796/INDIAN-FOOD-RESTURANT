package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import cardupload.cargettersetter;
import carupload.carinterImpl;
import carupload.carinterface;

public final class buy_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\"> \n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("        <title>Buy Product</title>\n");
      out.write("        <style>\n");
      out.write("            .column {\n");
      out.write("                float: left;\n");
      out.write("                width: 24.8%;\n");
      out.write("                margin-bottom: 16px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("            }\n");
      out.write("            /* Display the columns below each other instead of side by side on small screens */\n");
      out.write("            @media (max-width: 650px) {\n");
      out.write("                .column {\n");
      out.write("                    width: 100%;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /* Add some shadows to create a card effect */\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.9);\n");
      out.write("            }\n");
      out.write("            /* Some left and right padding inside the container */\n");
      out.write("            .container {\n");
      out.write("                padding: 0 16px;\n");
      out.write("            }\n");
      out.write("            /* Clear floats */\n");
      out.write("            .container::after, .row::after {\n");
      out.write("                content: \"\";\n");
      out.write("                clear: both;\n");
      out.write("                display: table;\n");
      out.write("            }\n");
      out.write("            .title {\n");
      out.write("    color: grey;\n");
      out.write("}\n");
      out.write("       </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid top_bar\" id=\"homeID\">\n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"https://www.facebook.com\" class= \"social_icon\"> <i class=\"fa fa-facebook\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("                        <a href=\"https://www.twitter.com\" class= \"social_icon\"> <i class=\"fa fa-twitter\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("                        <a href=\"https://www.youtube.com\" class= \"social_icon\"> <i class=\"fa fa-youtube-play\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("                        <a href=\"https://www.gmail.com\" class= \"social_icon\"> <i class=\"fa fa-google-plus\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9 text-right contact_info\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-envelope\"></span> Desired Car's.com,    \n");
      out.write("                        <span class=\"glyphicon glyphicon-earphone\"></span>  +91-8285433485\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> <!--end of header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>                        \n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color:#00FF7F\">Desired Car's</a>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"buy_product.jsp\">Buy Products</a></li>\n");
      out.write("                        <li><a href=\"sale_products.jsp\">Sale Products</a></li>\n");
      out.write("                        <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("                        <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                        <!-- User Nmae -->\n");
      out.write("                        <  <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb"));
      out.write("</b></a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- User Registration Button -->\n");
      out.write("                        <li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!--navigation section end -->\n");
      out.write("\n");
      out.write("        <!--Product PAGE Searching Bar-->  \n");
      out.write("        <!--div class=\"container\"> \n");
      out.write("        <div row=\"row\">\n");
      out.write("        <form>\n");
      out.write("          <input type=\"text\" name=\"search\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search Car...\"> <img src=\"images/searchcar.jpg\" width=\"15%\"/>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr><br>\n");
      out.write("        <!--Product PAGE Searching Bar END-->\n");
      out.write("        <!--PRODUCT PAGE -->\n");
      out.write("        <!--products section start-->\n");
      out.write("        <br>\n");
      out.write("        ");

            carinterImpl impl = new carinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\" style=\"margin-left: 8px\">\n");
      out.write("\n");
      out.write("            ");
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
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--latest footer at bottom start -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid footer\" style=\"background-color:#7FFFDA;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <img src=\"images/footpic.jpg\" alt=\"\" class=\"img-responsive\" />\n");
      out.write("                    <p>At Scrubs, we know your time is valuable. Having to take your car in to get washed and detailed is typically a hassle. Even going out without your vehicle for a few hours can be inconvenient at the best of times....</p>\n");
      out.write("\n");
      out.write("                    <p><a href=\"#\" class=\"btn btn-danger\" >Read More...</a></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4 midfooter\">\n");
      out.write("                    <h3>Quick Links</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">&raquo; Home </a></li>\n");
      out.write("                        <li><a href=\"buy_product.jsp\">&raquo; Buy Products</a></li>\n");
      out.write("                        <li><a href=\"about_us.jsp\">&raquo; About Us</a></li>\n");
      out.write("                        <li><a href=\"contact_us.jsp\">&raquo; Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <h3>Contact Details</h3>\n");
      out.write("                <p>Address : </strong> Abra khan,(Delhi)</p>\n");
      out.write("                <p>Email : </strong> Abrar4295@gmail.com</p>\n");
      out.write("                <p>Phone : </strong>8285433485 </p>\n");
      out.write("                <p style=\"text-align: right; margin-right: 60px;\">Timing : </strong> 10:00am to 9:30pm</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--latest footer at bottom ending -->\n");
      out.write("        <!--footer section end -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"background-color:green; color:orange\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" style=\"color:red\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Fill your details to contact Dealer</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form action=\"finalbook.jsp\" method=\"post\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"pwd\">Name:</label>\n");
      out.write("     <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your name\" name=\"bname\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("         <label for=\"pwd\">Email:</label>\n");
      out.write("     <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\" name=\"bemail\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label>Contact:</label>\n");
      out.write("      <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your mobile number\" onchange=\"CheckIndianNumber(this.value)\" name=\"bnumber\" maxlength=\"10\"required>\n");
      out.write("    </div>\n");
      out.write("              <script>\n");
      out.write("function CheckIndianNumber(IndianNumber)\n");
      out.write("{\n");
      out.write("var IndNum = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("if(IndNum.test(IndianNumber))\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("  'Success!',\n");
      out.write("  'Valid Mobile Number',\n");
      out.write("  'success'\n");
      out.write(")\n");
      out.write("       }\n");
      out.write("       else\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Mobile number is not valid!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("       }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("     <label>Your Messages:</label>\n");
      out.write("  <textarea class=\"form-control\" rows=\"5\" name=\"bcomment\" required></textarea> \n");
      out.write("    </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">SUBMIT</button> \n");
      out.write("  </form>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
          out.write("\n");
          out.write("\n");
          out.write("                <div class=\"column\">\n");
          out.write("                    <div class=\"card\" style=\"background-color: black\">\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarimage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"320px\" height=\"320px\"/> \n");
          out.write("                        <div class=\"container\">\n");
          out.write("                            <h5><b style=\"color:#fff\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></h5>\n");
          out.write("                            <p class=\"title\">Author By Abrar</p> \n");
          out.write("                            <p style=\"background-color: gray; width:290px; padding: 10px\"><b  style=\"color: red\"> Rs./- </b><b style=\"color: black\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.getCarprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b> <input style=\"margin-left: 60px\" class =\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#myModal\" type=\"button\" value=\"Book Now\"></p>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            ");
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
