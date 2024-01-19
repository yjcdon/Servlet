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
@WebServlet("/r1")
public class Output extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("utf-8");
//        response.setHeader("content-type", "text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
//        两种方法不能同时使用

//        获取字符输出流(只能输出字符串)
        PrintWriter writer = response.getWriter();
//        输出数据
        writer.write("你好");

////        获取字节输出流(可以输出任意数据)
//        ServletOutputStream out=response.getOutputStream();
//        out.write("hello world!!!".getBytes());
    }

}
