package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>INDIAN FOOD RESTAURANT</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/slider.css\">\n");
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/jquery-migrate-1.1.1.js\"></script>\n");
      out.write("<script src=\"js/superfish.js\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js/sForm.js\"></script>\n");
      out.write("<script src=\"js/jquery.carouFredSel-6.1.0-packed.js\"></script>\n");
      out.write("<script src=\"js/tms-0.4.1.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(window).load(function () {\n");
      out.write("    $('.slider')._TMS({\n");
      out.write("        show: 0,\n");
      out.write("        pauseOnHover: false,\n");
      out.write("        prevBu: '.prev',\n");
      out.write("        nextBu: '.next',\n");
      out.write("        playBu: false,\n");
      out.write("        duration: 800,\n");
      out.write("        preset: 'fade',\n");
      out.write("        pagination: true, //'.pagination',true,'<ul></ul>'\n");
      out.write("        pagNums: false,\n");
      out.write("        slideshow: 8000,\n");
      out.write("        numStatus: false,\n");
      out.write("        banners: false,\n");
      out.write("        waitBannerAnimation: false,\n");
      out.write("        progressBar: false\n");
      out.write("    })\n");
      out.write("});\n");
      out.write("$(window).load(function () {\n");
      out.write("    $('.carousel1').carouFredSel({\n");
      out.write("        auto: false,\n");
      out.write("        prev: '.prev',\n");
      out.write("        next: '.next',\n");
      out.write("        width: 960,\n");
      out.write("        items: {\n");
      out.write("            visible: {\n");
      out.write("                min: 1,\n");
      out.write("                max: 4\n");
      out.write("            },\n");
      out.write("            height: 'auto',\n");
      out.write("            width: 240,\n");
      out.write("        },\n");
      out.write("        responsive: false,\n");
      out.write("        scroll: 1,\n");
      out.write("        mousewheel: false,\n");
      out.write("        swipe: {\n");
      out.write("            onMouse: false,\n");
      out.write("            onTouch: false\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <header>\n");
      out.write("    <div class=\"container_12\">\n");
      out.write("      <div class=\"grid_12\">\n");
      out.write("          <h1><a href=\"home_1.jsp\"><img src=\"images/indian food1.jpg\" alt=\"\"></a></h1>\n");
      out.write("        <div class=\"menu_block\">\n");
      out.write("          <nav>\n");
      out.write("            <ul class=\"sf-menu\">\n");
      out.write("                <li class=\"current\"><a href=\"home_1.jsp\">Home</a></li>\n");
      out.write("              \n");
      out.write("                <li class=\"with_ul\"><a href=\"about us.jsp\">About Us</a>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"#\"> cuisine</a></li>\n");
      out.write("                  <li><a href=\"#\">Good rest</a></li>\n");
      out.write("                  <li><a href=\"#\">Services</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("              <li><a href=\"contact_us.jsp\">Contacts</a></li>\n");
      out.write("              <li><a><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</b></a></li>\n");
      out.write("            <li ><a href=\"Login .jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("     \n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <div class=\"slider-relative\">\n");
      out.write("    <div class=\"slider-block\">\n");
      out.write("      <div class=\"slider\">\n");
      out.write("        <ul class=\"items\">\n");
      out.write("            <li><img src=\"images/nav3.jpeg\" alt=\"\"/></li>\n");
      out.write("        \n");
      out.write("            <li><img src=\"images/nav2.jpeg\" alt=\"\"></li>\n");
      out.write("            <li class=\"mb0\"><img src=\"images/nav1.jpeg\" alt=\"\"></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"content page1\">\n");
      out.write("    <div class=\"container_12\">\n");
      out.write("      <div class=\"grid_7\">\n");
      out.write("        <h2>Welcome</h2>\n");
      out.write("        <div class=\"page1_block col1\"> <img src=\"images/welcome_img.png\"style=\"width:40%\" alt=\"\">\n");
      out.write("          <div class=\"extra_wrapper\">more</a> </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("            \n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid_5\">\n");
      out.write("        <h2>Features</h2>\n");
      out.write("        <ul class=\"list\">\n");
      out.write("          <li><a href=\"#\">Unlimited consultations and/or planning</a></li>\n");
      out.write("          <li><a href=\"#\">Expert advice on traditions, customs, aetiquette</a></li>\n");
      out.write("          <li><a href=\"#\">Determine and stay within budget</a></li>\n");
      out.write("          <li><a href=\"#\">Choosing the right Wedding Venue</a></li>\n");
      out.write("          <li><a href=\"#\">Provide preferred vendor's list</a></li>\n");
      out.write("          <li><a href=\"#\">Assist with wedding scheme and design</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <div class=\"grid_12\">\n");
      out.write("        <div class=\"hor_separator\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid_12\">\n");
      out.write("        <div class=\"car_wrap\">\n");
      out.write("          <h2>Best Choice</h2>\n");
      out.write("          <a href=\"#\" class=\"prev\"></a><a href=\"#\" class=\"next\"></a>\n");
      out.write("          <ul class=\"carousel1\">\n");
      out.write("            <li>\n");
      out.write("                <div><img src=\"images/rajma-chawal1_1.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"col1 upp\"> <a href=\"Rajmachawal.jsp\">Rajma CHAWAL</a></div>\n");
      out.write("                <span> </span>\n");
      out.write("                <div class=\"price\">120&#8377</div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div><img src=\"images/indian thali.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"col1 upp\"> <a href=\"indian thali.jsp\">INDIAN THALI</a></div>\n");
      out.write("                <span> </span>\n");
      out.write("                <div class=\"price\">120&#8377</div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div><img src=\"images/upma-recipe28.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"col1 upp\"> <a href=\"upma.jsp\">UPMA</a></div>\n");
      out.write("                <span></span>\n");
      out.write("                <div class=\"price\">60&#8377</div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div><img src=\"images/avial2.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"col1 upp\"> <a href=\"avival.jsp\">AVIAL</a></div>\n");
      out.write("                <span> </span>\n");
      out.write("                <div class=\"price\">60&#8377</div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <div><img src=\"images/veg biryani 4_1.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"col1 upp\"> <a href=\"veg biryani.jsp\">VEG BIRYANI</a></div>\n");
      out.write("                <span></span>\n");
      out.write("                <div class=\"price\">120&#8377$</div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <div class=\"bottom_block\">\n");
      out.write("        <div class=\"grid_6\">\n");
      out.write("          <h3>Follow Us</h3>\n");
      out.write("          <div class=\"socials\"> <a href=\"#\"></a> <a href=\"#\"></a> <a href=\"#\"></a> </div>\n");
      out.write("          <nav>\n");
      out.write("            <ul>\n");
      out.write("              <li class=\"current\"><a href=\"index.html\">Home</a></li>\n");
      out.write("              <li><a href=\"about-us.html\">About Us</a></li>\n");
      out.write("              <li><a href=\"menu.html\">Menu</a></li>\n");
      out.write("              <li><a href=\"portfolio.html\">Portfolio</a></li>\n");
      out.write("              <li><a href=\"news.html\">News</a></li>\n");
      out.write("              <li><a href=\"contacts.html\">Contacts</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"grid_6\">\n");
      out.write("          <h3>Email Updates</h3>\n");
      out.write("          <p class=\"col1\">Join our digital mailing list and get news<br>\n");
      out.write("            deals and be first to know about events</p>\n");
      out.write("          <form id=\"newsletter\" action=\"#\">\n");
      out.write("            <div class=\"success\">Your subscribe request has been sent!</div>\n");
      out.write("            <label class=\"email\">\n");
      out.write("              <input type=\"email\" value=\"Enter e-mail address\" >\n");
      out.write("              <a href=\"#\" class=\"btn\" data-type=\"submit\">subscribe</a> <span class=\"error\">*This is not a valid email address.</span> </label>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<footer>\n");
      out.write("  <div class=\"container_12\">\n");
      out.write("    <div class=\"grid_12\"> INDIAN FOOD RESTAURANT &copy; 2045 | <a href=\"#\">Privacy Policy</a> | Design by: <a href=\"http://www.templatemonster.com/\">TemplateMonster.com</a> </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
}
