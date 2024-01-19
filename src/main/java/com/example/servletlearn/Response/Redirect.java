package com.example.servletlearn.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 15:54:01
 */
@WebServlet("/r2")
public class Redirect extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        System.out.println("Redirect.........");
        /*
        我看到的现象:你输入了r2回车后,会马上跳转到r3
         */
//        response.sendRedirect("login.jsp");
//        response.sendRedirect("https://www.baidu.com");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("https://www.baidu.com");

    }

}
