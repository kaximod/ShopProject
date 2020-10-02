package com.shop.service.Impl;

import com.shop.bean.Cart;
import com.shop.dao.CartDao;
import com.shop.dao.GoodsDao;
import com.shop.dao.Impl.CartDaoImpl;
import com.shop.dao.Impl.GoodsDaoImpl;
import com.shop.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    CartDao cartDao = new CartDaoImpl();
    @Override
    public int insert(Cart cart) {
        return cartDao.insert(cart);
    }

    @Override
    public int delete(int cartId) {
        return cartDao.delete(cartId);
    }

    @Override
    public int cleanAll() {
        return cartDao.cleanAll();
    }

    @Override
    public List<Cart> queryAll() {
        return cartDao.queryAll();
    }
}
