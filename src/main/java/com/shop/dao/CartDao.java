package com.shop.dao;

import com.shop.bean.Cart;
import com.shop.bean.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface CartDao {
    int insert(Cart cart);
    int delete(int cartId);
    int cleanAll(int userId);
    List<Cart> queryAll();
    List<Cart> queryById(int goodId,int userId);
    List<Cart> queryByUser(int userId);
    int update(int cartNum, BigDecimal cartPriceTotal, int cartId);
}
