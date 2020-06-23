<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/19
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--静态包含base相对路径--%>
    <%@include file="/pages/common/base.jsp"%>
    <link rel="stylesheet" href="static/css/css/all.css">
    <link rel="stylesheet" type="text/css" href="static/css/post.css">
    <link rel="stylesheet" type="text/css" href="static/css/header.css" >
</head>


<body>
<%--静态包含头部--%>
<%@include file="/pages/common/header.jsp"%>
<div class="title">

    <div class="post_type" id=""> <%--role_id--%>
        <a href="">红蝶：推演故事</a> <%--可以跳转到红蝶推演故事界面--%>
    </div>
    <div class="post_name" >
        <i class="fas fa-blog"></i>
        今天这位同学怎么回事
    </div>

</div>

<div class="post" id=" " ><%--post_id--%>

    <div class="post_user">
        秃头少女:
    </div>

    <div class="post_content"><%--帖子内容--%>
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。
        什么时候能写完论文？？？？还在这看帖子？？？红蝶小姐姐正在去家里的路上。

    </div>
    <div class="post_time"><%--发表时间--%>
        2020.06.29 12:00
    </div>

</div>


<div class="comment" id=" "><%--comment_id--%>

    <div class="comment_seq"><%--几楼--%>
        第<span>2</span>楼
    </div>
    <div class="comment_username" id="1"><%--id为user_id--%>
        秃头少年:
    </div>
    <div class="comment_content"><%--评论内容--%>
        那你还不快去写？？？？？
    </div>
    <div class="comment_time" ><%--发表时间--%>
        2020.06.29 12:30
    </div>

</div>


<div class="comment" id=" ">

    <div class="comment_seq">
        第<span>3</span>楼
    </div>
    <div class="comment_username" id="4">
        精神小伙:
    </div>
    <div class="comment_content">
        楼上说得对
    </div>
    <div class="comment_time" >
        2020.06.29 12:30
    </div>

</div>


<div class="comment" id=" ">

    <div class="comment_seq">
        第<span>4</span>楼
    </div>
    <div class="comment_username" id="3">
        精神小伙2号:
    </div>
    <div class="comment_content">
        作业代写，+10086。
<%--        1、角色时装介绍以及推演故事展览
        1.1主要界面设计
        1.2素材收集
        2、社交账号登陆（或者自行创建账号登陆，则包括用户注册，用户登录；需要涉及数据库或者其他社交平台的授权登陆接口）
        2.1 第五人格官方账号或管理员
        该账号角色用于发布/删除新角色、增加删除修改时装、审查恶意评论、审查发帖申请，包括刷屏、不良言论等。
        2.2 用户
        浏览该网站的玩家/用户，可以评论，回复，发帖，可以查看自己发布的帖子。
        3、评论讨论空间：
        4.1 每一个角色的每款时装下面都要有一个评论区，以及赞收集系统（用于评选最喜欢时装排行榜）
        4.2 每一个角色的推演任务故事介绍下面会有一个讨论区
        4.3 总论坛，主页面直接进入，用户可以创建帖子，帖子下面不同用户可以自由评论，有回复功能（只需要在文本下拉框开头内显示 “回复XXX“ 即可，可参考QQ空间评论区，也可以参考知乎）。--%>
    </div>
    <div class="comment_time" >
        2020.06.29 12:30
    </div>
</div>

<div class="textarea_container">

    <div class="textarea_container_left">
        <label>
    <textarea class="text" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。">

    </textarea>
        </label>
        <button class="comment_button">
            评论
        </button>
    </div>
    <div class="textarea_container_right">
        <i class="far fa-comment-dots"></i>
    </div>
</div>
</body>
</html>
