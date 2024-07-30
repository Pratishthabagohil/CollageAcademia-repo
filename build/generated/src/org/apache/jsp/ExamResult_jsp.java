package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ExamResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>My Course</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("          body {\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #4b4b4b; /* Dark gray background */\n");
      out.write("            color: white; /* White text color */\n");
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
      out.write("            position: relative;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 120px;\n");
      out.write("            background-color: white;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid lightgrey;\n");
      out.write("            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);\n");
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
      out.write("            top: 5px;\n");
      out.write("            right: 5px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .info-box .info {\n");
      out.write("            padding-left: 40px;\n");
      out.write("        }\n");
      out.write("        .light-text {\n");
      out.write("            color: #949494; /* Light gray color */\n");
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
 
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        // Establishing the database connection
        String url = "jdbc:mysql://localhost:3306/mydb";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, "root", "Pratishtha");

        String username = request.getParameter("username");
        String sql = "SELECT * FROM result WHERE username = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);

        rs = stmt.executeQuery();
        if (rs.next()) {
            
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <!-- Display user information -->\n");
      out.write("                <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 1</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem1"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 2</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem2"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 3</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem3"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 4</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem4"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 5</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem5"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 6</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem6"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 7</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem7"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"info-box\">\n");
      out.write("                    <b>Semester - 8</b>\n");
      out.write("                    <p>");
      out.print(rs.getString("Sem8"));
      out.write(" </p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </main>\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <!-- No user found message -->\n");
      out.write("                <p>No user found with the specified ID.</p>\n");
      out.write("            </main>\n");
      out.write("        ");

        }
    } catch (SQLException e) {
        // Handle SQL exceptions
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        // Handle class not found exception
        e.printStackTrace();
    } finally {
        // Closing resources in finally block
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

      out.write("\n");
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
