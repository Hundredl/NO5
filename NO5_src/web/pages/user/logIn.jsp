<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/17
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No5|LogIn</title>
    <%--静态包含base相对路径--%>
    <%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/logIn.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >

</head>

<body>
<script type="text/javascript">
    $(function () {
        $("#error_message").hide();
        if($("#error_message").is(":hidden")&&$("#error_message span").text()=="账户或密码错误！")
        {
            $("#error_message").show();
        }
        if($("#error_message").is(":hidden")&&$("#error_message span").text()=="登陆成功！")
        {
            $("#error_message ").show();
            $("#error_message i").hide();
        }
    })

</script>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>

<div class="banner">
<img src="static/img/logInBackGround2.gif" width="100%">
</div>

<div class="login_box">
    <form class="form-box" action="userServlet?action=logIn" method="post">
        <h1>Login</h1>
        <br>
        <div class="text_box">
            <i class="fas fa-user"></i>
            <input type="text" placeholder="Account" name="account">
        </div>

        <div class="text_box">
            <i class="fas fa-key"></i>
            <input type="password" placeholder="Password" name="password">
        </div>
        <input class="button" type="submit" value="LogIn" >
        <a class="link_signUp" href="pages/user/signUp.jsp">SignUp</a>
        <%if(session.getAttribute("sign_up_message")=="注册成功！请登录"){%>
        <div class="error_message">注册成功！请登录</div>
        <%
            session.setAttribute("sign_up_message","");
        %>
        <%}%>

    </form>
    <div class="error_message" id="error_message">
        <i class="fas fa-times-circle x-icon"></i>
        <span>${requestScope.log_in_message}</span>
        <%--<%=request.getAttribute("sign_up_message")==null||request.getAttribute("sign_up_message")==""?"":request.getAttribute("msg")==null%>--%>
    </div>
</div>

</body>
</html>
