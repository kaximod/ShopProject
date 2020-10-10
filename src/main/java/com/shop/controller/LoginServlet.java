package com.shop.controller;

import com.shop.bean.User;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    User user = null;
    User user2 = null;
    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        user = userService.queryByUser(username, password);

        if (user != null) {
            req.getSession().setAttribute("username", user.getUsername());
            req.getSession().setAttribute("user", user);
            req.getRequestDispatcher("pages/user/login_success.jsp").forward(req, resp);

        } else {
            req.setAttribute("message", "用户名或密码错误！");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }
    }
}
