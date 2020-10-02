package com.shop.dao;
import com.shop.bean.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsDao {
    List<Goods> queryAll();
    List<Goods> queryByName(String goodName);
    List<Goods> queryByPrice(BigDecimal price1,BigDecimal price2);
    int insert(Goods good);
    int delete(int goodId);
    int update(Goods good);
}
