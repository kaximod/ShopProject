package com.shop.dao;

import com.shop.bean.Cart;
import com.shop.bean.Goods;

import java.util.List;

public interface CartDao {
    int insert(Cart cart);
    int delete(int cartId);
    int cleanAll();
    List<Cart> queryAll();
}
