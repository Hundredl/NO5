package com.no5.web;

import com.no5.pojo.Costume;
import com.no5.pojo.Role;
import com.no5.services.CostumeService;
import com.no5.services.CostumeServiceImpl;
import com.no5.services.RoleService;
import com.no5.services.RoleServiceImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CostumeServlet",urlPatterns = "/costumeServlet")
public class CostumeServlet extends BaseServlet {
    public void getCostumeInfoByRoleId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role_id=request.getParameter("role_id");
        Object login_id=request.getSession().getAttribute("login_id");
        CostumeService costumeService=new CostumeServiceImpl();
        List<Costume> costumeList=costumeService.getCostumeInfoByRoleId(Integer.valueOf(role_id));
        /*获取点赞信息*/
        if(login_id==null||"".equals(login_id))
        {
            /*未登录,全部未点赞*/
            for (int i=0;i<costumeList.size();i++)
            {
                costumeList.get(i).setState("未点赞");
            }
        }
        else {
            List<Costume> costumeListLove=costumeService.queryLikeCostumeByUserId(Integer.valueOf(login_id.toString()));
            for (int i=0;i<costumeList.size();i++)
            {
                costumeList.get(i).setState("未点赞");
                for (int j=0;j<costumeListLove.size();j++)
                {
                    if(costumeList.get(i).getId().equals(costumeListLove.get(j).getId()))
                    {
                        costumeList.get(i).setState("已点赞");
                        System.out.println("已点赞");
                        break;
                    }
                }
            }
        }

        /*写回信息*/
        request.setAttribute("costume_list",costumeList);
        /*页面跳转*/
        request.getRequestDispatcher("pages/roles/roleInfo.jsp").forward(request,response);
    }
    public void like(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("CostumeServlet::like");
        String result;
        Object user_id=request.getSession().getAttribute("login_id");
        Object costume_id=request.getParameter("costume_id");
        Map<Object,Object> map=new HashMap<Object, Object>();
        if(user_id==null||"".equals(user_id.toString()))
        {
            map.put("result","未登录");
        }
        else
        {
            //已登录情况
            /*开始处理收藏请求*/
            CostumeService perfumeService=new CostumeServiceImpl();
            Integer isLoved=perfumeService.likeCostume(Integer.valueOf(user_id.toString()),Integer.valueOf(costume_id.toString()));
            if(isLoved==1)
            {
                //未点赞过，刚刚已经收藏了。
                map.put("result","点赞成功");
            }
            else
            {
                //说明已经添加过了,应该取消收藏
                perfumeService.disLikeCostume(Integer.valueOf(user_id.toString()),Integer.valueOf(costume_id.toString()));
                map.put("result","取消点赞成功");
            }
            map.put("costume_id",costume_id.toString());
            System.out.println("like");
            System.out.println(costume_id.toString());
            System.out.println(user_id.toString());
        }
        /*转换为JSON*/
        String jsonStr= JSONObject.valueToString(map);
        System.out.println(JSONObject.valueToString(map));
        /*写回*/
        PrintWriter printWriter=response.getWriter();
        printWriter.print(jsonStr);
        printWriter.flush();
    }
}
