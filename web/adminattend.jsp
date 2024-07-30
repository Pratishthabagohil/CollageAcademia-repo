<%-- 
    Document   : adminattend
    Created on : Apr 10, 2024, 8:50:37 PM
    Author     : Pratishtha
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function submitAttendance() {
                var checkboxes = document.getElementsByName('username');
                var selectedUsernames = [];
                checkboxes.forEach(function(checkbox) {
                    if (checkbox.checked) {
                        selectedUsernames.push(checkbox.value);
                    }
                });
                var subjectName = document.getElementById('subjectName').value;
                window.location.href = 'process.jsp?subject=' + subjectName + '&usernames=' + JSON.stringify(selectedUsernames);
            }
        </script>
    </head>
    <body>
        <form>
            <%
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
                    while(rs.next()){%>
                    <%=rs.getString("username")%>
                    <input type='checkbox' name='username' value='<%= rs.getString("username") %>'>
                    <br>
                    <%}
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
            %>
            <input type="hidden" id="subjectName" value="<%= sub %>">
            <input type="button" value="Submit Attendance" onclick="submitAttendance()">
        </form>
    </body>
</html>
