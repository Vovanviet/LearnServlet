<%@ page import="com.example.learnservlet.controller.ProductController" %><%--
  Created by IntelliJ IDEA.
  User: vietn
  Date: 6/12/2022
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<label> name:</label><br/>
<%= request.getParameter("proName")%><br/>
<label> description:</label><br/>
<%= request.getParameter("proDesc")%><br/>
<label> price:</label><br/>
<%= request.getParameter("price")%>
<%= %>
</body>
</html>
