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
 * @date: 2023/9/9 19:56:43
 */

@WebServlet("/c4")
public class SetCookiePath extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie1 = new Cookie("cookie1", "cookie1");
        //表示在当前服务器下任何项目都可以访问到这个cookie对象,在/demo下也看到了这个cookie
        cookie1.setPath("/");
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("cookie2", "cookie2");
        //默认(可以不设置),表示只有当前项目的资源才可以访问到这个cookie对象
        cookie2.setPath("/c4");
        response.addCookie(cookie2);

        Cookie cookie3 = new Cookie("cookie3", "cookie3");
        //表示只有demo路径下的资源才可以访问到这个cookie对象,而这里是/start路径,所以无法访问
        cookie3.setPath("/demo");
        response.addCookie(cookie3);

        Cookie cookie4 = new Cookie("cookie4", "cookie4");
        //指定路径才能访问到这个cookie对象,所以/start/c4路径下可以看到这个cookie对象,其他不行
        cookie4.setPath("/start/c4");
        response.addCookie(cookie4);
    }
}
