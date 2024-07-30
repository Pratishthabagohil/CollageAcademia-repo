package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class attendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Attendance</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        strong{\n");
      out.write("            margin-left:20px;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #ffcc33; /* Yellow color */\n");
      out.write("            color: #000; /* Black text color */\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header-left {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        main {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .buttons-container {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column; /* Arrange buttons vertically */\n");
      out.write("            gap: 10px; /* Space between buttons */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            height: 50px;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            border: 2px solid rgba(255, 255, 0, 0.5); /* Lighter shade border */\n");
      out.write("            border-radius: 5px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between; /* Align content to left and right */\n");
      out.write("            transition: border-color 0.3s ease;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: black;\n");
      out.write("            padding: 0 20px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            width: calc(100% - 40px); /* Calculate width to cover the entire space with padding */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            border-color: rgba(255, 255, 255, 0.9); /* Lighter shade border on hover */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-left\">\n");
      out.write("            <h1>Attendance</h1>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        <div class=\"buttons-container\">\n");
      out.write("            ");
 
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                String url="jdbc:mysql://localhost:3306/mydb";
                // Establishing the database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, "root", "Pratishtha");
                String username=request.getParameter("username");
                // SQL query to retrieve attendance data
                String sql = "SELECT * FROM stud WHERE username = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                // Executing the query
                rs = stmt.executeQuery();
                
                // Displaying buttons with attendance data
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Theory of Computation</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Theory Of Computation") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Software Engineering with UML</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Software Engineering With UML") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Data Science</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Data Science") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Internet of Things</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Internet Of Things") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Advanced Java Technology</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Advance Java Technology") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Cryptography and Network Security</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Cryptography & Network Security") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Software Engineering with UML - Practical</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Software Engineering With UML - Practical") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Data Science - Practical</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Data Science - Practical") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Internet of Things - Practical</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Internet Of Things - Practical") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Advanced Java Technology - Practical</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Advance Java Technology - Practical") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            <button>\n");
      out.write("                <i class=\"fa fa-book\"></i>\n");
      out.write("                <strong>Cryptography and Network Security - Practical</strong>\n");
      out.write("                <span>");
      out.print( rs.getString("Cryptography & Network Security - Practical") );
      out.write("</span>\n");
      out.write("            </button>\n");
      out.write("            ");
 
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Closing resources
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            
      out.write("\n");
      out.write("        </div>\n");
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
