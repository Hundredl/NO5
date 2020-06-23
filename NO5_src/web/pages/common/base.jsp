<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/17
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--写base标签，永远固定相对路径跳转的结果-->
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";

    pageContext.setAttribute("basePath",basePath);
%>
<base href="<%=basePath%>">

<script type="text/javascript" src="static/script/jquery-3.5.1.js"></script>
