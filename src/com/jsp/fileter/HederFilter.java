package com.jsp.fileter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "HederFilter", servletNames = {"HelloServlet"})
public class HederFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("The header his");

        System.out.println(((HttpServletRequest )req).getHeader("host"));

        System.out.println();

        //chain.doFilter(req, resp);

        ((HttpServletResponse) resp).sendError(403);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
