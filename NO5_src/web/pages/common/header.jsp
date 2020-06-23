<%--
  Created by IntelliJ IDEA.
  User: Hundredl
  Date: 2020/6/17
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(session.getAttribute("login_username")==null)
    {
        session.setAttribute("username","LogIn");
    }
%>
<header>
    <a href="pages/homepage.jsp" class="logo" >No5</a><%--<img src="static/img/homepage/PLUM.png" width='100' height="50">--%>
    <ul>
        <li><a href="roleServlet?action=getHunters">监管者</a>
            <%--<ul>
                <li> <a href="brandServlet?action=getBrandDesc">红蝶</a> </li>
                <li> <a href="../AerinPage/AerinFirstPage.html">杰克</a> </li>
            </ul>--%>
        </li>

        <li>
            <a href="roleServlet?action=getSurvivors">求生者</a>
        </li>
        <li>
            <a href="pages/post/post.jsp"> 论坛</a>
        </li>
        <%--<li>
            <a href="pages/roles/roleSelect.jsp">Role</a>
        </li>--%>
        <%--pages/user/logIn.jsp--%>
        <li><a href="pages/user/logIn.jsp"><%=session.getAttribute("login_username")==null?"LogIn":session.getAttribute("login_username")%> </a></li><%--userServlet--%>
    </ul>

</header>

<script type="text/javascript">
    window.addEventListener("scroll",function () {
        var header=document.querySelector("header");
        header.classList.toggle("sticky",window.scrollY>0);
    })
</script>
