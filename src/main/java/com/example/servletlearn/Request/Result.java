package com.example.servletlearn.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/s4")
public class Result extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("result........");

        String name = (String) request.getAttribute("name");
        System.out.println(name);
        int age = (Integer) request.getAttribute("age");
        System.out.println(age);
    }

}