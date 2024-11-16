<%@ page contentType="text/html; charset=ISO-8859-1" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Dashboard</title>
    <link rel="stylesheet" type="text/css" href="stylejava.css">
</head>
<body>
    <div class="container">
        <h1>Student Dashboard</h1>
        <h2>Welcome, <%= request.getAttribute("name") %>!</h2>
        <p>Here are your details:</p>
        <ul>
            <li><strong>Name:</strong> <%= request.getAttribute("name") %></li>
            <li><strong>Email:</strong> <%= request.getAttribute("email") %></li>
            <li><strong>Phone Number:</strong> <%= request.getAttribute("phnno") %></li>
            <li><strong>Course:</strong> <%= request.getAttribute("course") %></li>
        </ul>

        <p class="thank-you-message">Thank you for registering!</p>
    </div>
</body>
</html>
