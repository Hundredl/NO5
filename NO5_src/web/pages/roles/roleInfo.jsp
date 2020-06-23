<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/18
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No5|RoleSelect</title>
    <%--静态包含base相对路径--%>
    <%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/roleInfo.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >
    <link rel="stylesheet" type="text/css" href="static/css/message_box.css" >

    <%--&lt;%&ndash;图片的效果&ndash;%&gt;
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js" charset="utf-8"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js" charset="utf-8"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css">--%>

</head>
<body>

<script>
    function close_box() {
        $(".message_box").hide();
    }
    $(function () {
        $(".user_id").hide();
        $(".message_box").hide();
        $(".like_box").click(function () {
            console.log("like_box clicked");
            const costume_id=$(this).attr("id");
            const login_id=$(".user_id").text();
            console.log(login_id);
            $.ajax({
                url:"costumeServlet?action=like&costume_id="+costume_id,
                dataType:"json",
                async:true,//默认为true，异步
                data:{"costume_id":costume_id,"user_id":login_id},
                type:"POST",
                success:function (data) {
                    const per_id=costume_id;
                    if(data.result=="未登录")
                    {

                        console.log("未登录");
                        $("#like").hide();
                        $("#cancel_like").hide();
                        $("#not_login").show();//$("#message_box_plum").children
                        console.log($("[id='" + per_id + "']").text());
                        console.log(per_id);
                    }
                    else if(data.result=="点赞成功")
                    {
                        console.log("点赞成功");
                        $("#like").show();
                        $("#cancel_like").hide();
                        $("#not_login").hide();
                        console.log(per_id);
                        console.log($("[id='" + per_id + "']").text("已点赞"));
                    }
                    else if(data.result=="取消点赞成功")
                    {
                        console.log("取消点赞成功");
                        $("#like").hide();
                        $("#cancel_like").show();
                        $("#not_login").hide();
                        console.log(per_id);
                        console.log($("[id='" + per_id + "']").text("未点赞"));
                    }
                    $(".message_box").show();
                }
            })
        })
    })
</script>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>
<div class="banner">
    <img src="static/img/roleInfoBanner.jpg" width="100%">
</div>

<div class="user_id" >
    <%=request.getSession().getAttribute("login_id")%>
</div>
<div class="role_info" id="${requestScope.role_info.id}">
    <div class="name">${requestScope.role_info.name}</div>
    <br>
    <div class="classify">${requestScope.role_info.classify}</div>
</div>

<div class="tales_btn">
    <a href="<${requestScope.role_info.id}>"  > 推演剧情   </a>
    <br>
    <a href=" "> 角色论坛</a>
</div>


<div class="costume_box_wrap ">
    <ul class="main">
        <div class="costumes_box owl-stage">
            <c:forEach items="${requestScope.costume_list}" var="costume">
                <li class="main_sub">
                    <div class="img_box">
                        <img src="${costume.cover}">
                    </div>
                    <div class="costume_box">
                        <div class="description">
                            <div class="costume_box_title">${costume.name}</div>
                            <div class="info">${costume.intro}</div>
                            <div class="like_box btn" id="${costume.id}"> ${costume.state}</div>
                        </div>
                    </div>
                </li>

            </c:forEach>
        </div>

    </ul>

</div>


<div class="message_box" id="message_box">
    <div class="succ_pop">
        <div class="title">
            <i class="fas fa-times-circle" id="times" onclick="close_box()"></i>
        </div>
        <div class="message " id="not_login">
            <i class="far fa-dizzy"></i>未登录!
        </div>
        <div class="message like" id="like">
            <i class="fas fa-laugh-squint"></i>点赞成功!
        </div>
        <div class="message " id="cancel_like">
            <i class="far fa-sad-tear"></i>取消点赞成功!
        </div >
        <button class="confirmation" id="confirmation" onclick="close_box()">
            确认
        </button>
    </div>
</div>


</body>
</html>
