<%-- 
    Document   : mainmenu
    Created on : Apr 6, 2024, 6:31:15 PM
    Author     : Pratishtha
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Academia</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
        }

        header {
            background-color: #de0a26;
            color: #fff;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .settings-icon {
            color: #fff;
            font-size: 24px;
        }

        main {
            padding: 20px;
        }

        .fields {
            display: flex;
            flex-direction: column; /* Arrange fields vertically */
            margin-top: 20px;
        }

        .field {
            height: 50px;
            background-color: #f0f0f0;
            border: 2px solid rgba(255, 0, 0, 0.2); /* Lighter shade border */
            border-radius: 5px;
            display: flex;
            align-items: center;
            justify-content: flex-start; /* Align content to the left */
            transition: border-color 0.3s ease;
            margin-bottom: 10px; /* Add margin between fields */
            cursor: pointer; /* Change cursor to pointer */
            font-weight: bold; /* Bold font */
            color: black; /* Black text color */
            padding-left: 10px; /* Add left padding */
            padding-right: 10px; /* Add right padding */
        }

        .field:hover {
            border-color: rgba(255, 255, 255, 0.9); /* Lighter shade border on hover */
            cursor: pointer; /* Change cursor to pointer on hover */
        }

        /* Different border colors for each field */
        .red-border {
            border-color: rgba(255, 0, 0, 0.6); /* Lighter shade red color */
        }

        .yellow-border {
            border-color: rgba(255, 255, 0, 0.6); /* Lighter shade yellow color */
        }

        .green-border {
            border-color: rgba(0, 255, 0, 0.6); /* Lighter shade green color */
        }

        .blue-border {
            border-color: rgba(0, 0, 255, 0.6); /* Lighter shade blue color */
        }

        /* Remove button default styles */
        button {
            border: none;
            background: none;
            cursor: pointer;
            padding: 0;
            font: inherit;
            outline: inherit;
            width: 100%;
            display: flex;
            align-items: center;
        }

        /* Image after header */
        .header-image {
            margin-top: 20px;
            text-align: center;
        }

        .header-image img {
            width: 200px;
            height: auto;
        }
    </style>
</head>
<body>
    <header>
        <h1>Academia</h1>
        <div class="settings-icon">&#9881;</div>
    </header>
    <div class="header-image">
        <img src="https://indusuni.ac.in/wp-content/uploads/2019/02/INDUS-UNIVERSITY-LOGO.png" alt="Indus University Logo">
    </div>
    <main>
        <div class="fields">
         <button class="field red-border" onclick="redirectToServlet('Mycourse.jsp', '<%= request.getParameter("username") %>')">
    <i class="fas fa-book"></i>&nbsp;&nbsp;My Course
</button>

<button class="field yellow-border" onclick="redirectToServlet('attendance.jsp', '<%= request.getParameter("username") %>')">
    <i class="fas fa-clipboard-check"></i>&nbsp;&nbsp;Attendance
</button>

<button class="field green-border" onclick="redirectToServlet('Fees.jsp', '<%= request.getParameter("username") %>')">
    <i class="fas fa-wallet"></i>&nbsp;&nbsp;Fees
</button>

<button class="field red-border" onclick="redirectToServlet('AssignmentsServlet', '<%= request.getParameter("username") %>')">
    <i class="fas fa-file"></i>&nbsp;&nbsp;Assignments
</button>

<button class="field blue-border" onclick="redirectToServlet('ExamResult.jsp', '<%= request.getParameter("username") %>')">
    <i class="fas fa-file-alt"></i>&nbsp;&nbsp;Exam Result
</button>

<button class="field green-border" onclick="redirectToServlet('EventsServlet', '<%= request.getParameter("username") %>')">
    <i class="fas fa-video"></i>&nbsp;&nbsp;Events
</button>

<button class="field yellow-border" onclick="redirectToServlet('TimeTableServlet', '<%= request.getParameter("username") %>')">
    <i class="fas fa-calendar-alt"></i>&nbsp;&nbsp;TimeTable
</button>

<button class="field blue-border" onclick="redirectToServlet('CircularsServlet', '<%= request.getParameter("username") %>')">
    <i class="fas fa-newspaper"></i>&nbsp;&nbsp;Circulars
</button>

<button class="field green-border" onclick="redirectToServlet('student.jsp', '<%= request.getParameter("username") %>')">
    <i class="fas fa-user-graduate"></i>&nbsp;&nbsp;Student
</button>

<script>
    function redirectToServlet(servletName, id) {
        window.location.href = servletName+'?username=' + encodeURIComponent(id);

    }
</script>

        </div>
    </main>
</body>
</html>

