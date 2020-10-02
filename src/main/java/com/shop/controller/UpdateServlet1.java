package com.shop.controller;

import com.shop.bean.Goods;
import com.shop.service.GoodsService;
import com.shop.service.Impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("upid");
        String flag=req.getParameter("flag");
        req.setAttribute("updateId",id);
        req.setAttribute("flag",flag);
        req.getRequestDispatcher("pages/manager/shop_edit.jsp").forward(req,resp);
    }
}
