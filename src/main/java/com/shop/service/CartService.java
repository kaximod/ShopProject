package com.shop.service;

import com.shop.bean.Cart;

import java.math.BigDecimal;
import java.util.List;

public interface CartService {
    int insert(Cart cart);
    int delete(int cartId);
    int cleanAll(int userId);
    List<Cart> queryAll();
    List<Cart> queryByUser(int userId);
    List<Cart> queryById(int goodId,int userId);
    int update(int cartNum, BigDecimal cartPriceTotal, int cartId);
}
