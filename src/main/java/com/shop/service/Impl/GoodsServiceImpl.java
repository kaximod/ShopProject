package com.shop.service.Impl;

import com.shop.bean.Goods;
import com.shop.dao.GoodsDao;
import com.shop.dao.Impl.GoodsDaoImpl;
import com.shop.service.GoodsService;

import java.math.BigDecimal;
import java.util.List;

public class GoodsServiceImpl implements GoodsService {
    GoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> queryAll() {
        return goodsDao.queryAll();
    }

    @Override
    public List<Goods> queryByName(String goodName) {
        return goodsDao.queryByName(goodName);
    }

    @Override
    public List<Goods> queryByPrice(BigDecimal price1, BigDecimal price2) {
        return goodsDao.queryByPrice(price1, price2);
    }

    @Override
    public int insert(Goods good) {
        return goodsDao.insert(good);
    }

    @Override
    public int delete(int goodId) {
        return goodsDao.delete(goodId);
    }

    @Override
    public int update(Goods good) {
        return goodsDao.update(good);
    }
}
