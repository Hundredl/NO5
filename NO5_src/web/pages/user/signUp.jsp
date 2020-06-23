<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/17
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No5|SignUp</title>
    <%--静态包含base相对路径--%>
    <%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/logIn.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >
</head>
<body>

<script type="text/javascript">
    $(function () {
        /*$(".error_message span").text("可爱");*/
        console.log($(".error_message span").text());
        console.log($(".error_message span"));
        console.log($(".error_message span").html());
        console.log($(".error_message").is(":hidden"));
        /*if($(".error_message").is(":hidden")==false&&($(".error_message span").text()=="可爱"))
        {
            $(".error_message").hide();
        }
        else
        {
            $(".error_message").show();
        }*/
        $(".error_message").hide();
        if($(".error_message").is(":hidden")&&$(".error_message span").text()=="账户已被注册！")
        {
            $(".error_message").show();
        }
        $(".button").click(function () {
            //验证account
            var account=$("#account").val();
            if(account.length>20)
            {
                $(".error_message ").show();
                $(".error_message span").text("账户名称不能超过20位！");
                return false;
            }
            if(account.length<=0)
            {
                $(".error_message ").show();
                $(".error_message span").text("账户名称不能为空！");
                return false;
            }
            var username=$("#username").val();
            if (username.length>20)
            {
                $(".error_message ").show();
                $(".error_message span").text("用户名不能超过20位！");
                return false;
            }
            if(username.length<=0)
            {
                $(".error_message ").show();
                $(".error_message span").text("用户名不能为空！");
                return false;
            }
            // 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
            //1 获取用户名输入框里的内容
            var passwordText = $("#password").val();
            //2 创建正则表达式对象
            var passwordPatt = /^\w{5,12}$/;
            //3 使用test方法验证
            if (!passwordPatt.test(passwordText)) {
                //4 提示用户结果
                $(".error_message ").show();
                $(".error_message span").text("密码不合法！必须由字母，数字下划线组成，并且长度为5到12位");
                console.log("密码不合法！");
                return false;
            }
            // 验证确认密码：和密码相同
            //1 获取确认密码内容
            var repwdText = $("#password2").val();
            //2 和密码相比较
            if (repwdText != passwordText) {
                //3 提示用户
                $(".error_message ").show();
                $(".error_message span").text("确认密码和密码不一致！");
                console.log("确认密码和密码不一致！");
                return false;
            }
            // 去掉错误信息
            $(".error_message span").text("");
            //$(".error_message").show();
        });
    });
</script>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>

<div class="banner">
    <img src="static/img/logInBackGround2.gif" width="100%">
</div>

<div class="login_box">
    <form class="form-box" action="userServlet?action=signUp " method="post">
        <h1>SignUp</h1>

        <div class="text_box">
            <i class="fas fa-signature"></i>
            <input type="text" placeholder="Username" name="username" id="username">
        </div>
        <div class="text_box">
            <i class="fas fa-user"></i>
            <input type="text" placeholder="Account" name="account" id="account">
        </div>

        <div class="text_box">
            <i class="fas fa-unlock-alt"></i>
            <input type="password" placeholder="Password" name="password" id="password">
        </div>

        <div class="text_box">
            <i class="fas fa-unlock"></i>
            <input type="password" placeholder="ConfirmPassword" name="confirm_password" id="password2">
        </div>
        <input class="button" type="submit" value="SignUp" id="button">
        <%--<a class="link_signUp" href="#">SignUp</a>--%>
    </form>
    <div class="error_message">
        <i class="fas fa-times-circle x-icon"></i>
        <span>${requestScope.sign_up_message}</span>
        <%--<%=request.getAttribute("sign_up_message")==null||request.getAttribute("sign_up_message")==""?"":request.getAttribute("msg")==null%>--%>
    </div>
</div>
</body>
</html>
