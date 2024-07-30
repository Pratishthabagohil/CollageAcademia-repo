<%-- 
    Document   : Fees.jsp
    Created on : Apr 8, 2024, 1:46:53 PM
    Author     : Pratishtha
--%>
<%@ page import="java.sql.*, java.io.*, java.util.Base64" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Download Files</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .header {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: left;
        }

        .main-section {
            padding: 20px;
        }

        .info-box {
            height: 100px;
            position: relative;
            width: 100%; /* Each box takes up 25% of the width */
            margin-bottom: 20px;
            box-sizing: border-box;
            border: 1px solid lightgrey;
            box-shadow: 0px 0px 5px rgba(0,0,0,0.3);
            display: inline-block; /* Ensure boxes appear horizontally */
        }

        .info-box .info {
            padding: 10px;
            font-weight: bold; /* Make text bold */
        }

        .download-icon {
            font-size: 48px; /* Adjust icon size */
            color: red;
            margin-top: 20px; /* Add margin to position the icon */
            display: block; /* Ensure the icon appears on its own line */
        }
    </style>
</head>
<body>
    <div class="header">
        <h2>Fees</h2>
    </div>

    <div class="main-section">
        <h3>Billed Receipt</h3>
        <%
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
        %>
        <div class="info-box">
            <span class="info">Receipt for Semester 1</span>
            <a class="download-btn" href="data:application/octet-stream;base64,<%= sem1 %>" download="Receipt_Sem_1.pdf" style="right:20px; top: 30px;"><i class="fa fa-file-pdf-o download-icon" style="font-size:24px "></i></a>
        </div>
        <div class="info-box">
            <span class="info">Receipt for Semester 2</span>
            <a class="download-btn" href="data:application/octet-stream;base64,<%= sem2 %>" download="Receipt_Sem_2.pdf"style="right:20px; top: 30px;"><i class="fa fa-file-pdf-o download-icon"style="font-size:24px"></i></a>
        </div>
        <div class="info-box">
            <span class="info">Receipt for Semester 3</span>
            <div style="right:20px; top: 30px;">
                <a class="download-btn" href="data:application/octet-stream;base64,<%= sem3 %>" download="Receipt_Sem_3.pdf"><i class="fa fa-file-pdf-o download-icon"style="font-size:24px"></i></a></div>
        </div>
        <div class="info-box">
            <span class="info">Receipt for Semester 4</span>
            <a class="download-btn" href="data:application/octet-stream;base64,<%= sem4 %>" download="Receipt_Sem_4.pdf" style="right:20px; top: 30px;"><i class="fa fa-file-pdf-o download-icon"style="font-size:24px"></i></a>
        </div>
        <% } else { %>
            <p>No file found for the specified user.</p>
        <% }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try { if(rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if(stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if(conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        } %>
   
