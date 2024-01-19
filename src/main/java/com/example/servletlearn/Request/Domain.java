package com.example.servletlearn.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/s3")
public class Domain extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("domain........");

        request.setAttribute("name", "admin");
        request.setAttribute("age", 18);

//        这种用得少,一般都用于跳转到jsp
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

}