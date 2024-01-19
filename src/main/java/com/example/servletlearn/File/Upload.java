package com.example.servletlearn.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/10 13:21:53
 */

// 后台实现
@WebServlet("/file1")
@MultipartConfig    //这个注解必须要加上,否则无法获得表单中的数据
public class Upload extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

//        获取表单中输入的数据
        String name = request.getParameter("name"); //这个"name"就是表单中name属性的值
        System.out.println("name:" + name);

//        servlet将multipart/form-data的请求数据封装成Part对象
        Part part = request.getPart("myfile");  //这里的"myfile"就是表单中file文件域的name属性值

//        通过part对象获得上传的文件名
        String fileName = part.getSubmittedFileName();
        System.out.println("fileName:" + fileName);

//        得到文件的存储路径
        String path = request.getServletContext().getRealPath("/");
        System.out.println("path:" + path);

//        上传文件到指定路径
        part.write(path + "/" + fileName);

    }
}
