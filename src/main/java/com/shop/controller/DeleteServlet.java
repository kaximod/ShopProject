package com.shop.controller;

import com.shop.bean.Goods;
import com.shop.service.GoodsService;
import com.shop.service.Impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteServlet extends HttpServlet {
    GoodsService goodsService=new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String goodId=req.getParameter("id");
        goodsService.delete(Integer.valueOf(goodId));
        List<Goods> GoodsList = goodsService.queryAll();
        req.setAttribute("GoodsList", GoodsList);
        req.getRequestDispatcher("pages/manager/shop_manager.jsp").forward(req,resp);
    }
}
