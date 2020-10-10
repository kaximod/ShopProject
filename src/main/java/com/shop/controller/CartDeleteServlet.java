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
import java.math.BigDecimal;
import java.util.List;

public class CartDeleteServlet extends HttpServlet {
    CartService cartService = new CartServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Cart> CartList3 = cartService.queryByUser(((User) req.getSession().getAttribute("user")).getId());
        String delId = req.getParameter("delid").trim();
        cartService.delete(Integer.valueOf(delId));
        BigDecimal totalPrice = new BigDecimal(0);
        for (int i = 0; i < CartList3.size(); i++) {
            totalPrice = totalPrice.add(CartList3.get(i).getCartPriceTotal());
        }
        req.setAttribute("resultPrice", totalPrice);
        List<Cart> CartList = cartService.queryAll();
        req.setAttribute("CartList", CartList);
        req.setAttribute("CartListSize", CartList.size());
        req.getRequestDispatcher("pages/cart/cart.jsp").forward(req, resp);
    }
}
