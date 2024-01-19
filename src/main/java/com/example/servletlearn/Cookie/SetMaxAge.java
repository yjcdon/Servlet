package com.example.servletlearn.Cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 19:09:32
 */
@WebServlet("/c3")
public class SetMaxAge extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie1 = new Cookie("name1", "zhangsan");
        cookie1.setMaxAge(-1); //关闭浏览器就会删除
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("name2", "lisi");
        cookie2.setMaxAge(1000); //10s后自动删除
        response.addCookie(cookie2);

        Cookie cookie3 = new Cookie("name3", "wangwu");
        cookie3.setMaxAge(0); //根本就不会出现
        response.addCookie(cookie3);
    }
}
