
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.learnservlet.controller.ProductController" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Servlet" %>
</h1>
<br/>

<form action="createProduct.jsp" method="post">
    <label>Enter name product:</label>
    <input type="text" name="proName">
    <label>Enter product description:</label>
    <input type="text" name="proDesc">
    <label>Enter price:</label>
    <input type="text" name="price">
    <input type="submit" value="Submit">
</form>
</body>
</html>