package com.example.servletlearn.Session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 20:38:07
 */

@WebServlet("/se1")
public class GetAttr extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        获取session对象
        HttpSession session = request.getSession();

//        获取session对象的会话标识符————JSESSIONID
        String id = session.getId();
        System.out.println(id);

//        获取session对象的创建时间
        long createTime = session.getCreationTime();
        System.out.println(createTime);

//        获取session对象的最后访问时间
        long lastAccessTime = session.getLastAccessedTime();
        System.out.println(lastAccessTime);

//        判断是否是新的session对象
        boolean isNew = session.isNew();
        System.out.println(isNew);
    }
}
