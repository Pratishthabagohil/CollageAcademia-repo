<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Attendance</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }
        strong{
            margin-left:20px;
        }
        header {
            background-color: #ffcc33; /* Yellow color */
            color: #000; /* Black text color */
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header-left {
            display: flex;
            align-items: center;
        }

        main {
            padding: 20px;
        }

        .buttons-container {
            display: flex;
            flex-direction: column; /* Arrange buttons vertically */
            gap: 10px; /* Space between buttons */
        }

        button {
            height: 50px;
            background-color: #f0f0f0;
            border: 2px solid rgba(255, 255, 0, 0.5); /* Lighter shade border */
            border-radius: 5px;
            display: flex;
            align-items: center;
            justify-content: space-between; /* Align content to left and right */
            transition: border-color 0.3s ease;
            cursor: pointer;
            font-weight: bold;
            color: black;
            padding: 0 20px;
            font-size: 16px;
            width: calc(100% - 40px); /* Calculate width to cover the entire space with padding */
        }

        button:hover {
            border-color: rgba(255, 255, 255, 0.9); /* Lighter shade border on hover */
        }
    </style>
</head>
<body>
    <header>
        <div class="header-left">
            <h1>Attendance</h1>
        </div>
    </header>

    <main>
        <div class="buttons-container">
            <% 
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                String url="jdbc:mysql://localhost:3306/mydb";
               
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, "root", "Pratishtha");
                String username=request.getParameter("username");
              
                String sql = "SELECT * FROM stud WHERE username = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
               
                rs = stmt.executeQuery();
                
               
                while (rs.next()) {
            %>
            <button>
                <i class="fa fa-book"></i>
                <strong>Theory of Computation</strong>
                <span><%= rs.getString("Theory Of Computation") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Software Engineering with UML</strong>
                <span><%= rs.getString("Software Engineering With UML") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Data Science</strong>
                <span><%= rs.getString("Data Science") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Internet of Things</strong>
                <span><%= rs.getString("Internet Of Things") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Advanced Java Technology</strong>
                <span><%= rs.getString("Advance Java Technology") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Cryptography and Network Security</strong>
                <span><%= rs.getString("Cryptography & Network Security") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Software Engineering with UML - Practical</strong>
                <span><%= rs.getString("Software Engineering With UML - Practical") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Data Science - Practical</strong>
                <span><%= rs.getString("Data Science - Practical") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Internet of Things - Practical</strong>
                <span><%= rs.getString("Internet Of Things - Practical") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Advanced Java Technology - Practical</strong>
                <span><%= rs.getString("Advance Java Technology - Practical") %></span>
            </button>
            <button>
                <i class="fa fa-book"></i>
                <strong>Cryptography and Network Security - Practical</strong>
                <span><%= rs.getString("Cryptography & Network Security - Practical") %></span>
            </button>
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
        </div>
    </main>
</body>
</html>
