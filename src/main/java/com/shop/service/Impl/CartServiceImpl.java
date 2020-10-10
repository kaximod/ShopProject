package com.shop.service.Impl;

import com.shop.bean.Cart;
import com.shop.dao.CartDao;
import com.shop.dao.GoodsDao;
import com.shop.dao.Impl.CartDaoImpl;
import com.shop.dao.Impl.GoodsDaoImpl;
import com.shop.service.CartService;

import java.math.BigDecimal;
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
    public int cleanAll(int userId) {
        return cartDao.cleanAll(userId);
    }

    @Override
    public List<Cart> queryAll() {
        return cartDao.queryAll();
    }

    @Override
    public List<Cart> queryByUser(int userId) {
        return cartDao.queryByUser(userId);
    }

    @Override
    public List<Cart> queryById(int goodId, int userId) {
        return cartDao.queryById(goodId,userId);
    }

    @Override
    public int update(int cartNum, BigDecimal cartPriceTotal, int cartId) {
        return cartDao.update(cartNum, cartPriceTotal,cartId);
    }
}
