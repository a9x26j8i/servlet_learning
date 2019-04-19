package com.zewei.mylearning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod().toLowerCase();
        //legal input
        if (!method.equals("post")) {
            resp.getWriter().append("sorry, please use post method");
            return;
        }
        resp.getWriter().append("loginservlet received\n");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.getWriter().append("your username:" + username + "\n")
                        .append("your password:" + password + "\n");
        return;
    }
}
