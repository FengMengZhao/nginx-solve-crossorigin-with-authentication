package com.fmz.springboot.nginxdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class LoginServlet
 * 注解Servlet，不需要在web.xml中配置
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final String userID = "admin";
    private final String password = "123456";

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // get request parameters for userID and password
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        if(userID.equals(user) && password.equals(pwd)){
            HttpSession session = request.getSession();
            session.setAttribute("user", "Pankaj");
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30*60);
            Cookie userName = new Cookie("user", user);
            userName.setMaxAge(30*60);
            response.addCookie(userName);
            //登录成功后跳转的JSP
            //response.sendRedirect("/WEB-INF/jsp/LoginSuccess.jsp");
            //response.sendRedirect("/loginSuccess");
            response.sendRedirect("http://192.168.20.45");
        }else{
            //RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            response.setContentType("text/html; charset=UTF-8");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/Login.jsp");
            PrintWriter out= response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }

    }
}
