<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/18
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No5|RoleSelect</title>
    <%--静态包含base相对路径--%>
    //<%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/roleSelect.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >
</head>
<body>

<script type="text/javascript">
    $(function () {
        $(".img_box img").click(function () {
            const role_id=$(this).attr("id");
            console.log("roleSelect::"+role_id);
            window.location.href="roleServlet?action=getRoleInfo&role_id="+role_id;
            /*$.ajax({
                url:"roleServlet?action=getRoleInfo&role_id="+role_id,
                dataType:"json",
                async:true,//默认为true，异步
                data:{"role_id":role_id},
                type:"POST",
                success:function (data) {
                }
            })*/
        })
    })
</script>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>

<div class="banner">
    <img src="static/img/roleSelectBanner.jpg" width="100%">
</div>

<div class="roles_box_wrap">
    <div class="roles_box">
        <c:forEach items="${requestScope.role_list}" var="role">
            <div class="role_box" >
                <div class="role_id">
                        ${role.id}
                </div>
                <div class="img_box" >

                    </a>
                    <img src="${role.cover}" id="${role.id}">
                </div>

                <div class="title">
                        ${role.name}
                </div>
            </div>
        </c:forEach>
    </div>
</div>

</body>
</html>
