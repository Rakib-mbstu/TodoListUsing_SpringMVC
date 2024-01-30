<%@ page import="com.dsi.Lists" %><%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 1/30/24
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view</title>
</head>
<body>
   <%= request.getAttribute("lists")
   %>
</body>
</html>
