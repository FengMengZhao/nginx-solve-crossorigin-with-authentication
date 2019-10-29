package com.fmz.springboot.nginxdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "authenticationFilter", urlPatterns = {"/*"})
public class AuthenticationFilter implements Filter{

    private ServletContext servletContext;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.servletContext = filterConfig.getServletContext();
        this.servletContext.log("Authentication初始化！");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String URI = request.getRequestURI();
        this.servletContext.log("Request Source::"  + URI);

        HttpSession session = request.getSession(false);
        if(session == null && !(URI.equals("/login.html") ||
                URI.equals("/login") || URI.equals("/logout"))){
            this.servletContext.log("未经认证的访问！");
            response.sendRedirect("/login.html");
        }else{
            System.out.println("AuthenticationFilter执行完毕！");
        }

        filterChain.doFilter(request, response);
        System.out.println("AuthenticationFilter执行完毕！");
    }

    @Override
    public void destroy() {

    }
}
