package com.shop.service;

import com.shop.bean.Cart;

import java.util.List;

public interface CartService {
    int insert(Cart cart);
    int delete(int cartId);
    int cleanAll();
    List<Cart> queryAll();
}
