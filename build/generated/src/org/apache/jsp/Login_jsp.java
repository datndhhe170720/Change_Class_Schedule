package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /* Reset CSS */\n");
      out.write("* {\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground-color: #f0f0f0;\n");
      out.write("\tfont-family: Arial, sans-serif;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\talign-items: center;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\theight: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-container {\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tpadding: 30px;\n");
      out.write("\tbox-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("\tcolor: #ff8c00;\n");
      out.write("\tfont-size: 26px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-container {\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("\tcolor: #666;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"],\n");
      out.write("input[type=\"password\"] {\n");
      out.write("\tpadding: 10px;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbox-shadow: inset 0 2px 3px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("\tpadding: 15px;\n");
      out.write("\tbackground-color: #ff8c00;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tbox-shadow: 0 2px 3px rgba(0, 0, 0, 0.1);\n");
      out.write("\ttransition: background-color 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("\tbackground-color: #ffa500;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <form action=\"login\" method=\"post\" style=\"margin:auto\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"account\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AccEr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PassEr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td><input type=\"submit\" value=\"LOGIN\"><td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                        <input type=\"submit\" value=\"LOGIN\" >\n");
      out.write("        </form>\n");
      out.write("                -->\n");
      out.write("       <div class=\"login-container\">\n");
      out.write("\t\t<h1 class=\"title\">LOGIN FPT</h1>\n");
      out.write("                <form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"input-container\">\n");
      out.write("\t\t\t\t<label for=\"username\">Username</label>\n");
      out.write("                                <input type=\"text\" id=\"account\" name=\"account\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AccEr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"input-container\">\n");
      out.write("\t\t\t\t<label for=\"password\">Password</label>\n");
      out.write("                                <input type=\"password\" id=\"password\" name=\"password\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${PassEr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"button\">LOGIN</button>\n");
      out.write("                        <br>\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t</form>\n");
      out.write("                <a href=\"forgotPassword.jsp\">Forgot password</a>\n");
      out.write("\t</div>\n");
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
