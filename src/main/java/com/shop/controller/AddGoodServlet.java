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

public class AddGoodServlet extends HttpServlet {
    Goods insertgoods = null;
    Goods updategoods=null;
    GoodsService goodsService = new GoodsServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String flag=req.getParameter("shop_flag");
        System.out.println("flag"+flag);
        String goodName = req.getParameter("shop_name");
        String goodPrice = req.getParameter("shop_price");
        String goodBrand = req.getParameter("shop_author");
        String goodSales = req.getParameter("shop_sales");
        String goodStock = req.getParameter("shop_stock");
        String id=req.getParameter("shop_id");
        if(("insert").equals(flag)){
            insertgoods = new Goods(goodName, new BigDecimal(goodPrice), goodBrand, Integer.valueOf(goodSales), Integer.valueOf(goodStock));
            goodsService.insert(insertgoods );
            List<Goods> GoodsList = goodsService.queryAll();
            req.setAttribute("GoodsList", GoodsList);
            req.getRequestDispatcher("pages/manager/shop_manager.jsp").forward(req, resp);
        }
      if(("update").equals(flag)){
          updategoods = new Goods(goodName, new BigDecimal(goodPrice), goodBrand, Integer.valueOf(goodSales), Integer.valueOf(goodStock),Integer.valueOf(id));
          goodsService.update(updategoods);
          List<Goods> GoodsList = goodsService.queryAll();
          req.setAttribute("GoodsList", GoodsList);
          req.getRequestDispatcher("pages/manager/shop_manager.jsp").forward(req, resp);
      }
    }
}
