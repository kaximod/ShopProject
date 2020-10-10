package com.shop.service;

import com.shop.bean.Goods;
import com.shop.bean.Page;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {
    List<Goods> queryAll();
    List<Goods> queryByName(String goodName);
    List<Goods> queryById(int Id);
    List<Goods> queryByPrice(BigDecimal price1, BigDecimal price2);
    int insert(Goods good);
    int delete(int goodId);
    int update(Goods good);
    Page<Goods> page(int pageNo, int pageSize);
    Page<Goods> pageByPrice(int pageNo, int pageSize, int min, int max);
}
