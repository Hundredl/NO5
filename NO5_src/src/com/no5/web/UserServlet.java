package com.no5.web;

import com.no5.pojo.User;
import com.no5.services.UserService;
import com.no5.services.UserServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet",urlPatterns = "/userServlet")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServicesImpl();
    public void signUp(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String account=request.getParameter("account");
        if(userService.queryUserByAccount(account)!=null)
        {
            //邮箱已经被注册过了
            System.out.println("账户已被注册！");
            request.setAttribute("account",account);
            request.setAttribute("password",password);
            request.setAttribute("sign_up_message","账户已被注册！");

            //显示块
            PrintWriter out = response.getWriter();
            String content="$(function () {\n" +
                    "        $(\".error_message\").show();\n" +
                    "        $(\".error_message span\").text(\"账户已被注册！\")\n" +
                    "    })";
            out.println("<script language=\\\"javascript\\\">" + content + "</script>");
            //跳转回注册页面
            request.getRequestDispatcher("pages/user/signUp.jsp").forward(request,response);
        }
        else
        {
            //邮箱未注册
            userService.saveUser(new User(null,username,password,account));
            System.out.println("注册成功");
            //写回信息
            HttpSession session=request.getSession();
            request.setAttribute("sign_up_message","注册成功！请登录");
            session.setAttribute("sign_up_message","注册成功！请登录");
            session.setAttribute("sign_up_account",account);
            session.setAttribute("sign_up_password",password);
            //转到登录页面
            response.sendRedirect("/NO5/pages/user/logIn.jsp");
        }
    }

    public void logIn(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        User logInUser = userService.queryUserByAccountAndPassword(account, password);
        if (logInUser == null) {
            //密码错误
            //回写信息
            request.setAttribute("log_in_message", "账户或密码错误！");
            request.setAttribute("account", account);
            request.setAttribute("password", password);

            //跳转登录页面
            request.getRequestDispatcher("/pages/user/logIn.jsp").forward(request, response);
            System.out.println("登陆失败！" + account);
        } else {
            //跳转首页
            System.out.println("登陆成功！" + account);
            //设置logInUsername
            HttpSession session = request.getSession();
            request.setAttribute("log_in_message", "登陆成功！");
            session.setAttribute("login_username", logInUser.getUsername());
            session.setAttribute("login_account", logInUser.getAccount());
            session.setAttribute("login_id", logInUser.getId());
            System.out.println("登陆成功"+session.getAttribute("login_username"));

            /*跳转登陆页面*/
            request.getRequestDispatcher("/pages/homepage.jsp").forward(request, response);
            /*转到首页*/
            //response.sendRedirect("/Plum/pages/user/logIn.jsp");
            //request.getRequestDispatcher("pages/homepage.jsp").forward(request,response);
        }
    }
}
