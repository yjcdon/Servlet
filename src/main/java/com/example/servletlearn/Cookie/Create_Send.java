package com.example.servletlearn.Cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 18:55:04
 */
@WebServlet("/c1")
public class Create_Send extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
//        cookie对象的创建
        Cookie cookie = new Cookie("names", "zhangsan");
//        发送(响应)cookie对象
        response.addCookie(cookie);
    }
}
