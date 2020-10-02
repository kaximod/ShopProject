package com.shop.dao.Impl;

import com.shop.bean.Goods;
import com.shop.dao.BaseDao;
import com.shop.dao.GoodsDao;

import java.math.BigDecimal;
import java.util.List;

public class GoodsDaoImpl extends BaseDao implements GoodsDao {
    @Override
    public List<Goods> queryAll() {
        String sql="SELECT * FROM `GOOD`;";
        return queryForList(Goods.class,sql);
    }

    @Override
    public List<Goods> queryByName(String goodName) {
        String sql = "SELECT * FROM `good` WHERE `goodname` LIKE ?;";
        return queryForList(Goods.class, sql, "%" + goodName + "%");
    }
    @Override
    public List<Goods> queryByPrice(BigDecimal price1,BigDecimal price2) {
        String sql = "SELECT * FROM `good` WHERE `goodprice` >= ? AND `goodprice` <= ?;";
        return queryForList(Goods.class, sql, price1,price2);
    }
    @Override
    public int insert(Goods good) {
        int result = 0;
        String sql = "INSERT INTO `good` (`goodname`,`goodbrand`,`goodprice`,`goodsales`,`goodstock`,`goodimg`) VALUES (?,?,?,?,?,?);";
        result = update(sql,good.getGoodName(),good.getGoodBrand(),good.getGoodPrice(),good.getGoodSales(),good.getGoodStock(),good.getGoodImg());
        return result;
    }

    @Override
    public int delete(int goodId) {
        int result = 0;
        String sql = "DELETE FROM `good` WHERE `goodid` = ?;";
        result = update(sql, goodId);
        return result;
    }

    @Override
    public int update(Goods good) {
        int result = 0;
        String sql = "UPDATE `good` SET `goodname` = ?,`goodprice` = ?,`goodbrand`=?,`goodsales`=?,`goodstock`=? WHERE `goodid` = ?;";
        result = update(sql,good.getGoodName(),good.getGoodPrice(),good.getGoodBrand(),good.getGoodSales(),good.getGoodStock(),good.getGoodId() );
        return result;
    }
}
