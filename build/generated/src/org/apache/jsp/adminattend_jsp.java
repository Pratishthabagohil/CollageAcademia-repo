package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminattend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function submitAttendance() {\n");
      out.write("                var checkboxes = document.getElementsByName('username');\n");
      out.write("                var selectedUsernames = [];\n");
      out.write("                checkboxes.forEach(function(checkbox) {\n");
      out.write("                    if (checkbox.checked) {\n");
      out.write("                        selectedUsernames.push(checkbox.value);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                var subjectName = document.getElementById('subjectName').value;\n");
      out.write("                window.location.href = 'process.jsp?subject=' + subjectName + '&usernames=' + JSON.stringify(selectedUsernames);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            ");

                String sub = request.getParameter("subjectname");
                String url="jdbc:mysql://localhost:3306/mydb";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    throw new ServletException(e);
                }
                try (Connection connection = DriverManager.getConnection(url, "root", "Pratishtha")) {
                    String sql = "SELECT username FROM stud";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    ResultSet rs = statement.executeQuery();
                    while(rs.next()){
      out.write("\n");
      out.write("                    ");
      out.print(rs.getString("username"));
      out.write("\n");
      out.write("                    <input type='checkbox' name='username' value='");
      out.print( rs.getString("username") );
      out.write("'>\n");
      out.write("                    <br>\n");
      out.write("                    ");
}
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
            
      out.write("\n");
      out.write("            <input type=\"hidden\" id=\"subjectName\" value=\"");
      out.print( sub );
      out.write("\">\n");
      out.write("            <input type=\"button\" value=\"Submit Attendance\" onclick=\"submitAttendance()\">\n");
      out.write("        </form>\n");
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
