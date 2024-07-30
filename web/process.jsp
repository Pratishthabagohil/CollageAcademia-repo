<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String subjectName = request.getParameter("subject");
    String[] selectedUsernames = request.getParameterValues("usernames");
    String url="jdbc:mysql://localhost:3306/mydb";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    try (Connection connection = DriverManager.getConnection(url, "root", "Pratishtha")) {
        String updateQuery = "UPDATE stud SET " + subjectName + " = " + subjectName + " + 1 WHERE username = ?";
        PreparedStatement statement = connection.prepareStatement(updateQuery);
        for (String username : selectedUsernames) {
            statement.setString(1, username);
            statement.executeUpdate();
        }
        out.println("hello");
        response.sendRedirect("adminattend.jsp?subjectname=" + subjectName);
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>
