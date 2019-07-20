package com.jsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet(name = "DateServlet", urlPatterns = {"/Date"})
public class DateServlet extends HttpServlet {


    @Override
    public void init(){
        System.out.println("Servlet init");
    };

    @Override
    public void destroy(){
        System.out.println("Servlet destroy");
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       LocalDate today = LocalDate.now();

        PrintWriter out = response.getWriter();

        out.println("<p>Todays date is " + today + "</p>");

    }
}
