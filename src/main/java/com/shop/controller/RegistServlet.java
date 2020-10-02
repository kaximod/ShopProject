package com.shop.controller;

import com.shop.bean.User;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class RegistServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    User user = null;
    User user2 = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String repwd = req.getParameter("repwd");
        String email = req.getParameter("email");
        user = userService.queryByName(username);

        String token = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        req.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        String code = req.getParameter("code");
        if (token != null && token.equalsIgnoreCase(code)) {
            if (user != null) {
                req.setAttribute("mes", "用户名已存在");
                req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
            } else {
                user2 = new User(username, repwd, email);
                userService.insert(user2);
                req.setAttribute("mes", null);
                req.getRequestDispatcher("pages/user/regist_success.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("mes", "验证码错误");
            req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
        }


    }
}
