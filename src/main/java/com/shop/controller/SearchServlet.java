package com.shop.controller;

import com.shop.bean.Goods;
import com.shop.service.GoodsService;
import com.shop.service.Impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class SearchServlet extends HttpServlet {
    Goods goods=null;
    GoodsService goodsService=new GoodsServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String price1=req.getParameter("min");
        String price2=req.getParameter("max");
        List<Goods> goodsList=goodsService.queryByPrice(new BigDecimal(price1),new BigDecimal(price2));

    }
}
