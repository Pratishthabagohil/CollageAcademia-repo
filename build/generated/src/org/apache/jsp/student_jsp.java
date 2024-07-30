package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>User Information</title>\n");
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
      out.write("        .header-left {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .user-info {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .user-photo img {\n");
      out.write("            width: 100px; /* Adjust width as needed */\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 50%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-left\">\n");
      out.write("            <h2>Academia</h2>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"user-info\">\n");
      out.write("        <h2>User Information</h2>\n");
      out.write("\n");
      out.write("        ");
 
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String url="jdbc:mysql://localhost:3306/mydb";
            // Establishing the database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, "root", "Pratishtha");
            String username = request.getParameter("username");
            // SQL query to retrieve user information for a specific student (replace 'your_student_id' with the actual student ID)
            String sql = "SELECT * FROM students WHERE username = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            
            // Executing the query
            rs = stmt.executeQuery();
            
            // Displaying user information
            if (rs.next()) {
        
      out.write("\n");
      out.write("        <p><strong>ID:</strong> ");
      out.print( rs.getString("username") );
      out.write("</p>\n");
      out.write("        <p><strong>Name:</strong> ");
      out.print( rs.getString("name") );
      out.write("</p>\n");
      out.write("        <p><strong>Enrollment:</strong> ");
      out.print( rs.getString("username") );
      out.write("</p>\n");
      out.write("        <p><strong>Class:</strong> ");
      out.print( rs.getString("class") );
      out.write("</p>\n");
      out.write("        <p><strong>Branch:</strong> ");
      out.print( rs.getString("branch") );
      out.write("</p>\n");
      out.write("        <p><strong>Course:</strong> ");
      out.print( rs.getString("course") );
      out.write("</p>\n");
      out.write("        <p><strong>Address:</strong> ");
      out.print( rs.getString("address") );
      out.write("</p>\n");
      out.write("        <p><strong>Blood Group:</strong> ");
      out.print( rs.getString("blood_group") );
      out.write("</p>\n");
      out.write("        <p><strong>Indus Email:</strong> ");
      out.print( rs.getString("indus_email") );
      out.write("</p>\n");
      out.write("        <p><strong>Personal Email:</strong> ");
      out.print( rs.getString("personal_email") );
      out.write("</p>\n");
      out.write("    \n");
      out.write("        ");
 
              
            } else {
        
      out.write("\n");
      out.write("        <p>No user found with the specified ID.</p>\n");
      out.write("        ");
 
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
      out.write("    </div>\n");
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
