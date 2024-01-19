package com.example.servletlearn.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @project: ServletLearn
 * @description:
 * @author: 梁雨佳
 * @date: 2023/9/9 21:11:12
 */

@WebServlet("/se2")
public class DomainObject extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

//        设置session域对象
        session.setAttribute("name", "session");
        session.setAttribute("age", 20);

//        设置request域对象
        request.setAttribute("uname", "request");
        request.setAttribute("uage", 18);

        request.getRequestDispatcher("login.jsp").forward(request, response);

//        response.sendRedirect("login.jsp");
    }
}
