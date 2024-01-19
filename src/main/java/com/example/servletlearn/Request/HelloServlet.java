package com.example.servletlearn.Request;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/s1")
public class HelloServlet extends HttpServlet {

    //在对应的地址下.这个方法在服务器启动的时候就会执行，只会执行一次  可选的
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("创建了实例");
    }

    //    每次当请求到达Servlet(我认为是访问了这个类的地址)时,就会调用该方法
    //    在这里调用doGet之类的方法,建议这些方法都加上重写注解
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("跳转到了HelloServlet");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().write("Hello World!");
        System.out.println("doGet被调用了");
    }

    //    自动调用,当服务器关闭或app停止时会调用,只会执行一次   可选的
    @Override
    public void destroy() {
        super.destroy();
        System.out.println("销毁了实例");
    }
}