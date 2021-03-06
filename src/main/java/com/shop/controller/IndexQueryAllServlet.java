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

public class IndexQueryAllServlet extends HttpServlet {
    GoodsService goodsService=new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Goods> indexGoodsList = goodsService.queryAll();
        req.setAttribute("IndexGoodsList", indexGoodsList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
