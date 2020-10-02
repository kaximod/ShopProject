package com.shop.dao.Impl;

import com.shop.bean.Cart;
import com.shop.dao.BaseDao;
import com.shop.dao.CartDao;

import java.util.List;

public class CartDaoImpl extends BaseDao implements CartDao {
    @Override
    public int insert(Cart cart) {
        int result = 0;
        String sql = "INSERT INTO `cart` (`cartId`,`userId`,`cartName`,`cartNum`,`cartPrice`,`cartPriceTotal`) VALUES (?,?,?,?,?,?);";
        result = update(sql,cart.getCartId(),cart.getUserId(),cart.getCartName(),cart.getCartNum(),cart.getPrice(),cart.getPriceTotal());
        return result;
    }

    @Override
    public int delete(int cartId) {
        int result = 0;
        String sql = "DELETE FROM `cart` WHERE `cartId` = ?;";
        result = update(sql, cartId);
        return result;
    }

    @Override
    public int cleanAll() {
        int result = 0;
        String sql = "DELETE FROM `cart` WHERE `userId` = ?;";
        result = update(sql);
        return result;
    }

    @Override
    public List<Cart> queryAll() {
        String sql="SELECT * FROM `cart`;";
        return queryForList(Cart.class,sql);
    }
}
