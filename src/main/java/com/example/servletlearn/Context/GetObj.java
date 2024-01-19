package com.example.servletlearn.Context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/10 10:48:25
 */
@WebServlet("/ct1")
public class GetObj extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
//        通过request对象获取
        ServletContext context1 = request.getServletContext();

//        通过session对象获取
        ServletContext context2 = request.getSession().getServletContext();

//        通过ServletConfig对象获取
        ServletContext context3 = getServletConfig().getServletContext();

//        直接获取
        ServletContext context4 = getServletContext();

//        ======================================================================
//        常用方法
//        1.获取当前服务器的版本信息
        String serverInfo = context1.getServerInfo();
        response.getWriter().write("当前服务器版本：" + serverInfo + "<br>");

//        获取当前项目的真实路径
        String realPath = context1.getRealPath("/");
        response.getWriter().write("当前项目的真实路径：" + realPath);
    }

}
