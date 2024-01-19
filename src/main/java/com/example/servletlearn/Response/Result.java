package com.example.servletlearn.Response;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 16:53:30
 */
@WebServlet("/r3")
public class Result extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Result.........");
    }
}
