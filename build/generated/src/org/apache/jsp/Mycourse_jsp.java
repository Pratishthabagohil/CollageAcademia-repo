package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Mycourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>My Course</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #de0a26; \n");
      out.write("            color: white; /* Black text color */\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header-right {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header-right i {\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("        main {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .info-box {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 120px;\n");
      out.write("            background-color: white;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid lightgrey;\n");
      out.write("            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        .info-box:before {\n");
      out.write("            content: \"\\f02d\";\n");
      out.write("            font-family: \"Font Awesome 5 Free\";\n");
      out.write("            position: absolute;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 5px;\n");
      out.write("            transform: translateY(-50%);\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .info-box:after {\n");
      out.write("            content: \"\\f141\";\n");
      out.write("            font-family: \"Font Awesome 5 Free\";\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 5px;\n");
      out.write("            right: 5px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .info-box p {\n");
      out.write("            margin: 5px 0;\n");
      out.write("        }\n");
      out.write("        .light-text {\n");
      out.write("            color: #949494; /* Light gray color */\n");
      out.write("        }\n");
      out.write("        .info{\n");
      out.write("            padding-left: 50px;\n");
      out.write("        }\n");
      out.write("        .book-icon {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 20px;\n");
      out.write("            left: 20px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>My Course</h1>\n");
      out.write("        <div class=\"header-right\">\n");
      out.write("            <i class=\"fa fa-bell\"></i>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Internet Of Things</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Abhishek Vaghela</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div> <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div> <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"info-box\">\n");
      out.write("            <i class=\"fas fa-book-open book-icon\"></i>\n");
      out.write("            <div class = \"info\">\n");
      out.write("            <b>Theory Of Computation</b>\n");
      out.write("            <p><span class=\"light-text\">Course Code:</span> <span>CE0617</span></p>\n");
      out.write("            <p><span class=\"light-text\">Teacher:</span> <span>Gargi Nayan Bhatt</span></p>\n");
      out.write("            <p><span class=\"light-text\">Credits:</span> <span>4</span></p>\n");
      out.write("            </div>\n");
      out.write("            <i class=\"fa fa-ellipsis-v\" style=\"position: absolute; top: 20px; right: 30px;\"></i>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Additional info-boxes -->\n");
      out.write("    </main>\n");
      out.write("</body>\n");
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
