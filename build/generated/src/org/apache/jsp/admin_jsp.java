package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Subject</h1>\n");
      out.write("        <button onclick=\"redirectTo('Theory Of Computation')\">Toc</button>\n");
      out.write("    <button onclick=\"redirectTo('Software Engineering With UML')\">SEUML</button>\n");
      out.write("        <button onclick=\"redirectTo('Software Engineering With UML - Practical')\">SEUML Practical</button>\n");
      out.write("        <button onclick=\"redirectTo('Cryptography & Network Security')\">CNS</button>\n");
      out.write("        <button onclick=\"redirectTo('Cryptography & Network Security - Practical')\">CNS Practical</button>\n");
      out.write("        <button onclick=\"redirectTo('Internet Of Things')\">IOT</button>\n");
      out.write("        <button onclick=\"redirectTo('Internet Of Things - Practical')\">IOT Practical</button>\n");
      out.write("        <button onclick=\"redirectTo('Data Science')\">DS</button>\n");
      out.write("        <button onclick=\"redirectTo('Data Science - Practical')\">DS Practical</button>\n");
      out.write("        <button onclick=\"redirectTo('Advance Java Technology')\">AJT</button>\n");
      out.write("        <button onclick=\"redirectTo('Advance Java Technology - Practical')\">AJT Practical</button>\n");
      out.write("    <script>\n");
      out.write("    function redirectTo( id) {\n");
      out.write("        window.location.href = 'adminattend.jsp?subjectname=' + encodeURIComponent(id);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</script>\n");
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
