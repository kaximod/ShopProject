package com.shop.dao;
import com.shop.bean.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsDao {
    List<Goods> queryAll();
    List<Goods> queryByName(String goodName);
    List<Goods> queryById(int Id);
    List<Goods> queryByPrice(BigDecimal price1,BigDecimal price2);
    int insert(Goods good);
    int delete(int goodId);
    int update(Goods good);
    Integer queryForPageTotalCount();
    List<Goods> queryForPageItems(int begin, int pageSize);
    Integer queryForPageTotalCountByPrice(int min, int max);
    List<Goods> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
