package com.shop.dao.Impl;

import com.shop.bean.Cart;
import com.shop.bean.Goods;
import com.shop.dao.BaseDao;
import com.shop.dao.CartDao;
import com.shop.service.CartService;
import com.shop.service.Impl.CartServiceImpl;

import java.math.BigDecimal;
import java.util.List;

public class CartDaoImpl extends BaseDao implements CartDao {
    @Override
    public int insert(Cart cart) {
        int result = 0;
        String sql = "INSERT INTO `cart` (`cartId`,`goodId`,`userId`,`cartName`,`cartNum`,`cartPrice`,`cartPriceTotal`) VALUES (?,?,?,?,?,?,?);";
        result = update(sql,cart.getCartId(),cart.getGoodId(),cart.getUserId(),cart.getCartName(),cart.getCartNum(),cart.getCartPrice(),cart.getCartPriceTotal());
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
    public int cleanAll(int userId) {
        int result = 0;
        String sql = "DELETE FROM `cart` WHERE `userId` = ?;";
       result=update(sql,userId);
        return result;
    }

    @Override
    public List<Cart> queryAll() {
        String sql="SELECT * FROM `cart`;";
        return queryForList(Cart.class,sql);
    }

    @Override
    public List<Cart> queryById(int goodId,int userId) {
        String sql = "SELECT * FROM `cart` WHERE `goodid`= ? AND `userid`=?;";
        return queryForList(Cart.class, sql,goodId,userId);
    }

    @Override
    public List<Cart> queryByUser(int userId) {
        String sql = "SELECT * FROM `cart` WHERE `userid`=?;";
        return queryForList(Cart.class, sql,userId);
    }

    @Override
    public int update(int cartNum, BigDecimal cartPriceTotal,int cartId) {
        String sql = "UPDATE  `cart` SET `cartNum`=? , `cartPriceTotal`=? WHERE `cartid`= ?;";
        return update(sql,cartNum,cartPriceTotal,cartId);
    }
}
