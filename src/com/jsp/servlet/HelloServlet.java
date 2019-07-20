package com.jsp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello world!</h1>");
        out.println("<h3>A to juz jest mniejszy nagłówek</h3>");

        //response.sendRedirect("/JSPDemo/Date");

        //RequestDispatcher dispatcher = request.getRequestDispatcher("/Date");
        //dispatcher.forward(request,response);
        //lub
        //dispatcher.include(request,response);

    }


}
