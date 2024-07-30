/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pratishtha
 */
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class loginpage extends HttpServlet{
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
   String url="jdbc:mysql://localhost:3306/mydb";
   res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        String username = req.getParameter("username"); 
        String pass = req.getParameter("password");
        
  try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ServletException(e);
    
        }
   try (Connection connection = DriverManager.getConnection(url, "root", "Pratishtha")) {

             String sql = "SELECT * FROM logintb WHERE username=? AND password=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                if (username.equals("admin")) {
                    String redirectUrl = "admin.jsp?username=" + username;
                    res.sendRedirect(redirectUrl);
                } else {
                    String redirectUrl = "mainmenu.jsp?username=" + username;
                    res.sendRedirect(redirectUrl);
                }
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("loginpage.html");
                rd.include(req, res);
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }


        out.println("</body></html>");
    }
   
   
  }

