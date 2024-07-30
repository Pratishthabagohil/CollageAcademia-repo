package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.Base64;

public final class Fees_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <title>Download Files</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        .header {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-section {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-box {\n");
      out.write("            height: 100px;\n");
      out.write("            position: relative;\n");
      out.write("            width: 100%; /* Each box takes up 25% of the width */\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            border: 1px solid lightgrey;\n");
      out.write("            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);\n");
      out.write("            display: inline-block; /* Ensure boxes appear horizontally */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info-box .info {\n");
      out.write("            padding: 10px;\n");
      out.write("            font-weight: bold; /* Make text bold */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .download-icon {\n");
      out.write("            font-size: 48px; /* Adjust icon size */\n");
      out.write("            color: red;\n");
      out.write("            margin-top: 20px; /* Add margin to position the icon */\n");
      out.write("            display: block; /* Ensure the icon appears on its own line */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h2>Fees</h2>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-section\">\n");
      out.write("        <h3>Billed Receipt</h3>\n");
      out.write("        ");

            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                // Establishing the database connection
                String url = "jdbc:mysql://localhost:3306/mydb";
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, "root", "Pratishtha");

                String username = request.getParameter("username");
                String sql = "SELECT 1_billed, 2_billed, 3_billed, 4_billed FROM bill WHERE username = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);

                rs = stmt.executeQuery();
                if (rs.next()) {
                    byte[] file1 = rs.getBytes("1_billed");
                    String sem1 = Base64.getEncoder().encodeToString(file1);

                    byte[] file2 = rs.getBytes("2_billed");
                    String sem2 = Base64.getEncoder().encodeToString(file2);

                    byte[] file3 = rs.getBytes("3_billed");
                    String sem3 = Base64.getEncoder().encodeToString(file3);

                    byte[] file4 = rs.getBytes("4_billed");
                    String sem4 = Base64.getEncoder().encodeToString(file4);
        
      out.write("\n");
      out.write("        <div class=\"info-box\">\n");
      out.write("            <span class=\"info\">Receipt for Semester 1</span>\n");
      out.write("            <a class=\"download-btn\" href=\"data:application/octet-stream;base64,");
      out.print( sem1 );
      out.write("\" download=\"Receipt_Sem_1.pdf\" style=\"right:20px; top: 30px;\"><i class=\"fa fa-file-pdf-o download-icon\" style=\"font-size:24px \"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"info-box\">\n");
      out.write("            <span class=\"info\">Receipt for Semester 2</span>\n");
      out.write("            <a class=\"download-btn\" href=\"data:application/octet-stream;base64,");
      out.print( sem2 );
      out.write("\" download=\"Receipt_Sem_2.pdf\"style=\"right:20px; top: 30px;\"><i class=\"fa fa-file-pdf-o download-icon\"style=\"font-size:24px\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"info-box\">\n");
      out.write("            <span class=\"info\">Receipt for Semester 3</span>\n");
      out.write("            <div style=\"right:20px; top: 30px;\">\n");
      out.write("                <a class=\"download-btn\" href=\"data:application/octet-stream;base64,");
      out.print( sem3 );
      out.write("\" download=\"Receipt_Sem_3.pdf\"><i class=\"fa fa-file-pdf-o download-icon\"style=\"font-size:24px\"></i></a></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"info-box\">\n");
      out.write("            <span class=\"info\">Receipt for Semester 4</span>\n");
      out.write("            <a class=\"download-btn\" href=\"data:application/octet-stream;base64,");
      out.print( sem4 );
      out.write("\" download=\"Receipt_Sem_4.pdf\" style=\"right:20px; top: 30px;\"><i class=\"fa fa-file-pdf-o download-icon\"style=\"font-size:24px\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <p>No file found for the specified user.</p>\n");
      out.write("        ");
 }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try { if(rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if(stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if(conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        } 
      out.write("\n");
      out.write("   \n");
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
