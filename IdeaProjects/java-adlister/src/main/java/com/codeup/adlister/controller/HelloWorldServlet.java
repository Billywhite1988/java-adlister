package com.codeup.adlister.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "com.codeup.adlister.controller.HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int count = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        if (name != null) {
            out.println("<h1>Hello, " + name + "</h1>");
        } else {
            out.println("<h1 style=\"font-family: fantasy;\">Hello World</h1>");
        }
        count += 1;
        out.println("The count is " + count);
    }
}