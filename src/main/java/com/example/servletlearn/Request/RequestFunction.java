package com.example.servletlearn.Request;

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
 * @date: 2023/9/8 23:55:52
 */

@WebServlet("/request")
public class RequestFunction extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
//        获取请求时的完整路径,(从http开始,到?前结束)
        String url = request.getRequestURL().toString();
        System.out.println("请求路径:" + url);  //请求路径:http://localhost:8080/start/request

//        获取请求时的部分路径,从站点名开始,到?前结束
        String uri = request.getRequestURI();
        System.out.println("部分路径:" + uri);  //部分路径:/start/request

//        获取请求的参数(就是在URL后面加上?的就是参数开始,比如?uname=admin,那么输出就是uname=admin
//        不同参数间用个&连接
        String param = request.getQueryString();
        System.out.println("请求参数:" + param);    //请求参数:null

//        获取请求方式(GET&POST)
        String method = request.getMethod();
        System.out.println("请求方式:" + method);   //请求方式:

//        获取当前协议版本
        String protocol = request.getProtocol();
        System.out.println("协议版本:" + protocol); //协议版本:HTTP/1.1

//        获取项目对外访问路径
        String contextPath = request.getContextPath();
        System.out.println("项目对外访问路径:" + contextPath);  //项目对外访问路径:/start

//        获取请求的IP地址
        String ip = request.getRemoteAddr();
        System.out.println("请求的IP地址:" + ip);


//        获取指定名称的参数值(重要)
        String uname = request.getParameter("uname");
        String upsw = request.getParameter("upsw");
        System.out.println("RequestFunction uname:" + uname + ",upsw:" + upsw);

//        获取指定名称参数的所有参数值(一般用于复选框传值)
        String[] hobbys = request.getParameterValues("hobby");
        if (hobbys != null) {
            for (String hobby : hobbys) {
                System.out.println("hobby:" + hobby);
                /*
                hobby:sing
                hobby:dance
                hobby:rap
                 */
            }
        }

//        请求跳转
        /*
        地址栏不会变化,并且是服务端行为
        只会有一个请求,数据可共享
         */
        request.getRequestDispatcher("s1").forward(request, response);
    }
}
