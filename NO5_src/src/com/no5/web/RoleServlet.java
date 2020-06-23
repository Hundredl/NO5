package com.no5.web;

import com.no5.pojo.Role;
import com.no5.services.RoleService;
import com.no5.services.RoleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "RoleServlet",urlPatterns = "/roleServlet")
public class RoleServlet extends BaseServlet {
    RoleService roleService=new RoleServiceImpl();
    public void getHunters(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Role> roleList=roleService.getHunters();
        /*写回信息*/
        request.setAttribute("role_list",roleList);
        request.getRequestDispatcher("pages/roles/roleSelect.jsp").forward(request,response);
        //response.sendRedirect("/NO5/pages/roles/roleSelect.jsp");
    }
    public void getSurvivors(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Role> roleList=roleService.getSurvivors();
        /*写回信息*/
        request.setAttribute("role_list",roleList);
        request.getRequestDispatcher("pages/roles/roleSelect.jsp").forward(request,response);
    }
    public void getRoleInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role_Id=request.getParameter("role_id");
        System.out.println("RoleServlet::getProleInfo"+role_Id);
        Role role=roleService.getRoleById(Integer.valueOf(role_Id));
        /*回写信息*/
        request.setAttribute("role_info",role);
        /*跳转*/
        request.getRequestDispatcher("costumeServlet?action=getCostumeInfoByRoleId").forward(request,response);
    }
    public List<Role> modifyImgPath(List<Role> roleList)
    {
        Role role;
        for (int k=0;k<roleList.size();k++)
        {
            /*获取字符串*/
            role=roleList.get(k);
            String cover=role.getCover();

            /*处理*/
            String[] sList=role.getCover().split("\\");
            List<String> strList = Arrays.asList(sList);
            for(int i = 0; i < 5;i++)
                strList.remove(0);
            String[] sList2 = strList.toArray(new String[strList.size()]);
            cover = String.join("/",sList2);

            /*写回*/
            role.setCover(cover);
            System.out.println("cover="+cover);
        }
        return roleList;
    }
    /*public void changeCover() {
        String[] sList=cover.split("\\");
        List<String> strList = Arrays.asList(sList);
        for(int i = 0; i < 5;i++)
            strList.remove(0);
        String[] sList2 = strList.toArray(new String[strList.size()]);
        cover = String.join("/",sList2);
        System.out.println("cover="+cover);
    }*/


}
