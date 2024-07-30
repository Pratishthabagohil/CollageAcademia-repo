package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Academia</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: #de0a26;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .settings-icon {\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        main {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .fields {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column; /* Arrange fields vertically */\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .field {\n");
      out.write("            height: 50px;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            border: 2px solid rgba(255, 0, 0, 0.2); /* Lighter shade border */\n");
      out.write("            border-radius: 5px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: flex-start; /* Align content to the left */\n");
      out.write("            transition: border-color 0.3s ease;\n");
      out.write("            margin-bottom: 10px; /* Add margin between fields */\n");
      out.write("            cursor: pointer; /* Change cursor to pointer */\n");
      out.write("            font-weight: bold; /* Bold font */\n");
      out.write("            color: black; /* Black text color */\n");
      out.write("            padding-left: 10px; /* Add left padding */\n");
      out.write("            padding-right: 10px; /* Add right padding */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .field:hover {\n");
      out.write("            border-color: rgba(255, 255, 255, 0.9); /* Lighter shade border on hover */\n");
      out.write("            cursor: pointer; /* Change cursor to pointer on hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Different border colors for each field */\n");
      out.write("        .red-border {\n");
      out.write("            border-color: rgba(255, 0, 0, 0.6); /* Lighter shade red color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .yellow-border {\n");
      out.write("            border-color: rgba(255, 255, 0, 0.6); /* Lighter shade yellow color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .green-border {\n");
      out.write("            border-color: rgba(0, 255, 0, 0.6); /* Lighter shade green color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .blue-border {\n");
      out.write("            border-color: rgba(0, 0, 255, 0.6); /* Lighter shade blue color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Remove button default styles */\n");
      out.write("        button {\n");
      out.write("            border: none;\n");
      out.write("            background: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            padding: 0;\n");
      out.write("            font: inherit;\n");
      out.write("            outline: inherit;\n");
      out.write("            width: 100%;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Image after header */\n");
      out.write("        .header-image {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header-image img {\n");
      out.write("            width: 200px;\n");
      out.write("            height: auto;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Academia</h1>\n");
      out.write("        <div class=\"settings-icon\">&#9881;</div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"header-image\">\n");
      out.write("        <img src=\"https://indusuni.ac.in/wp-content/uploads/2019/02/INDUS-UNIVERSITY-LOGO.png\" alt=\"Indus University Logo\">\n");
      out.write("    </div>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"fields\">\n");
      out.write("            ");
 String username = request.getParameter("username");
      out.write("\n");
      out.write("         <button class=\"field red-border\" onclick=\"redirectToServlet('MyCourseServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-book\"></i>&nbsp;&nbsp;My Course\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field yellow-border\" onclick=\"redirectToServlet('attendance.jsp', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-clipboard-check\"></i>&nbsp;&nbsp;Attendance\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field green-border\" onclick=\"redirectToServlet('FeesServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-wallet\"></i>&nbsp;&nbsp;Fees\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field red-border\" onclick=\"redirectToServlet('AssignmentsServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-file\"></i>&nbsp;&nbsp;Assignments\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field blue-border\" onclick=\"redirectToServlet('ExamResultServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-file-alt\"></i>&nbsp;&nbsp;Exam Result\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field green-border\" onclick=\"redirectToServlet('EventsServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-video\"></i>&nbsp;&nbsp;Events\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field yellow-border\" onclick=\"redirectToServlet('TimeTableServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-calendar-alt\"></i>&nbsp;&nbsp;TimeTable\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field blue-border\" onclick=\"redirectToServlet('CircularsServlet', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-newspaper\"></i>&nbsp;&nbsp;Circulars\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<button class=\"field green-border\" onclick=\"redirectToServlet('student.jsp', '");
      out.print( request.getParameter("username") );
      out.write("')\">\n");
      out.write("    <i class=\"fas fa-user-graduate\"></i>&nbsp;&nbsp;Student\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function redirectToServlet(servletName, id) {\n");
      out.write("        window.location.href = servletName+'?username=' + encodeURIComponent(id);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
