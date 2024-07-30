<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Base64" %>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Information</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            font-size: 20px; /* Set the font size to make the text big */
        
        }

        header {
            background-color: #de0a26;
            color: #fff;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header-left {
            display: flex;
            align-items: center;
        }

        .user-info-container{
            float:left;
            width: 60%;
            padding: 20px;
            font-size: 20px;
        }

        .user-photo-container {
            display: flex;
            float: right;
            width: 40%;
            padding: 20px;
            text-align: right; /* Align the photo to the right */
            
        }

        .user-photo-container img {
            width: 300px; /* Increase the width of the photo */
            border-radius: 20px; /* Make the photo container square with rounded corners */
    
        }
    </style>
</head>
<body>
    <header>
        <div class="header-left">
            <h1>Academia</h1> <!-- Changed to h1 for a bigger header -->
        </div>
    </header>
        <% 
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
            String sql = "SELECT * FROM stud WHERE username = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            
            // Executing the query
            rs = stmt.executeQuery();
            
            // Displaying user information
            if (rs.next()) {
                %>
                <div class="user-info-container">
        <p><strong>ID:</strong> <%= rs.getString("username") %></p>
        <p><strong>Name:</strong> <%= rs.getString("name") %></p>
        <p><strong>Enrollment:</strong> <%= rs.getString("username") %></p>
        <p><strong>Class:</strong> <%= rs.getString("class") %></p>
        <p><strong>Branch:</strong> <%= rs.getString("branch") %></p>
        <p><strong>Course:</strong> <%= rs.getString("course") %></p>
        <p><strong>Address:</strong> <%= rs.getString("address") %></p>
        <p><strong>Blood Group:</strong> <%= rs.getString("blood_group") %></p>
        <p><strong>Indus Email:</strong> <%= rs.getString("indus_email") %></p>
        <p><strong>Personal Email:</strong> <%= rs.getString("personal_email") %></p>
</div>
        <div class="user-photo-container">
            <% 
            Blob blob = rs.getBlob("image");
            if (blob != null) {
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                String base64Image = Base64.getEncoder().encodeToString(imageData);
        %>
        <img src="data:image/jpeg;base64,<%= base64Image %>" alt="User Photo"></div>

        <% 
              }
            }else {
        %>
        <p>No user found with the specified ID.</p>
        <% 
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
        %>
   
   

</body>
</html>