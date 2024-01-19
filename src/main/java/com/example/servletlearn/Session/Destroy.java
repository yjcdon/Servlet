package com.example.servletlearn.Session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/10 10:03:08
 */

@WebServlet("/se3")
public class Destroy extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute("name", "梁雨佳");

//        System.out.println("session最大不活动时间:" + session.getMaxInactiveInterval());
////        修改最大不活动时间,单位:秒
//        session.setMaxInactiveInterval(10);  //10s不操作就失效
//        System.out.println("修改后,session最大不活动时间:" + session.getMaxInactiveInterval());

//        立即销毁session,在控制台中看到,一刷新JSESSIONID就变化
//        一般用于退出登录
//        session.invalidate();

//        关闭浏览器就失效
//        原理:session底层是通过cookie实现的,cookie只在浏览器内存中存活
        response.getWriter().write("JSESSIONID:" + session.getId());
    }
}
