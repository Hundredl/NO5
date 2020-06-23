<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/18
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No5|HomePage</title>
    <%--静态包含base相对路径--%>
    <%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/homepage.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >
</head>
<body>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>
<div class="banner">
    <img src="static/img/homepageBanner4.jpg" width="100%">
</div>

<div class="character">
    <img src="static/img/homepageCharacter.png" >
</div>

<div class="welcome">
    WELCOME!
</div>

<div class="welcome_text">
    Welcome to <strong>Identity V</strong>,
    the first asymmetrical horror mobile game developed
    by NetEase. With a gothic art style, mysterious storylines and an exciting 1vs4 gameplay,
    Identity V will bring you a breathtaking experience.
    You will first enter the game as a detective, who receives a mysterious
    letter inviting him to investigate an abandoned manor and search for a missing girl.
    And as you get closer and closer to the truth, you find something horrifying...
</div>

</body>
</html>
