<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/17
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    request.getRequestDispatcher("/pages/homepage.jsp").forward(request,response);
  %>
  ok
  </body>
</html>
