<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Course</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
          body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        header {
            background-color: #4b4b4b; /* Dark gray background */
            color: white; /* White text color */
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .header-right {
            display: flex;
            align-items: center;
        }
        .header-right i {
            margin-left: 10px;
        }
        main {
            padding: 20px;
        }
        .info-box {
            position: relative;
            width: 100%;
            height: 120px;
            background-color: white;
            margin-bottom: 20px;
            box-sizing: border-box;
            padding: 10px;
            border: 1px solid lightgrey;
            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);
        }
        .info-box:before {
            content: "\f02d";
            font-family: "Font Awesome 5 Free";
            position: absolute;
            top: 50%;
            left: 5px;
            transform: translateY(-50%);
            font-size: 20px;
        }
        .info-box:after {
            content: "\f141";
            font-family: "Font Awesome 5 Free";
            position: absolute;
            top: 5px;
            right: 5px;
            font-size: 20px;
        }
        .info-box .info {
            padding-left: 40px;
        }
        .light-text {
            color: #949494; /* Light gray color */
        }
        .book-icon {
            position: absolute;
            top: 20px;
            left: 20px;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <header>
        <h1>My Course</h1>
        <div class="header-right">
            <i class="fa fa-bell"></i>
        </div>
    </header>
<% 
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        String url = "jdbc:mysql://localhost:3306/mydb";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, "root", "Pratishtha");

        String username = request.getParameter("username");
        String sql = "SELECT * FROM result WHERE username = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);

        rs = stmt.executeQuery();
        if (rs.next()) {
            %>
            <main>
                <!-- Display user information -->
                <div class="info-box">
                    <b>Semester - 1</b>
                    <p><%=rs.getString("Sem1")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 2</b>
                    <p><%=rs.getString("Sem2")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 3</b>
                    <p><%=rs.getString("Sem3")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 4</b>
                    <p><%=rs.getString("Sem4")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 5</b>
                    <p><%=rs.getString("Sem5")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 6</b>
                    <p><%=rs.getString("Sem6")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 7</b>
                    <p><%=rs.getString("Sem7")%> </p>
                </div>
                  <div class="info-box">
                    <b>Semester - 8</b>
                    <p><%=rs.getString("Sem8")%> </p>
                </div>
                
            </main>
        <%
        } else {
        %>
            <main>
                <!-- No user found message -->
                <p>No user found with the specified ID.</p>
            </main>
        <%
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
%>
</body>
</html>

