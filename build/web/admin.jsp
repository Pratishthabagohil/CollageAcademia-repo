<%-- 
    Document   : admin.jsp
    Created on : Apr 10, 2024, 8:40:28 PM
    Author     : Pratishtha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Subject</h1>
        <button onclick="redirectTo('Theory Of Computation')">Toc</button>
    <button onclick="redirectTo('Software Engineering With UML')">SEUML</button>
        <button onclick="redirectTo('Software Engineering With UML - Practical')">SEUML Practical</button>
        <button onclick="redirectTo('Cryptography & Network Security')">CNS</button>
        <button onclick="redirectTo('Cryptography & Network Security - Practical')">CNS Practical</button>
        <button onclick="redirectTo('Internet Of Things')">IOT</button>
        <button onclick="redirectTo('Internet Of Things - Practical')">IOT Practical</button>
        <button onclick="redirectTo('Data Science')">DS</button>
        <button onclick="redirectTo('Data Science - Practical')">DS Practical</button>
        <button onclick="redirectTo('Advance Java Technology')">AJT</button>
        <button onclick="redirectTo('Advance Java Technology - Practical')">AJT Practical</button>
    <script>
    function redirectTo( id) {
        window.location.href = 'adminattend.jsp?subjectname=' + encodeURIComponent(id);

    }
</script>
    </body>
</html>
