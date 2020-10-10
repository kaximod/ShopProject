package com.shop.controller;

import com.shop.bean.Cart;
import com.shop.bean.User;
import com.shop.service.CartService;
import com.shop.service.Impl.CartServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CartCleanAllServlet extends HttpServlet {
    CartService cartService=new CartServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cart> CartList3 = cartService.queryByUser(((User) req.getSession().getAttribute("user")).getId());
        cartService.cleanAll(((User) req.getSession().getAttribute("user")).getId());
        req.setAttribute("CartList",CartList3);
        req.setAttribute("CartListSize", 0);
        req.setAttribute("resultPrice", 0);
        req.getRequestDispatcher("pages/cart/cart.jsp").forward(req,resp);
    }
}
