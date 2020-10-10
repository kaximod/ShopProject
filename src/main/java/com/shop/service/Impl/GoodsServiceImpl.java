package com.shop.service.Impl;

import com.shop.bean.Goods;
import com.shop.bean.Page;
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
    public List<Goods> queryById(int Id) {
        return goodsDao.queryById(Id);
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

    @Override
    public Page<Goods> page(int pageNo, int pageSize) {
        Page<Goods> page = new Page<Goods>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = goodsDao.queryForPageTotalCount();
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Goods> items = goodsDao.queryForPageItems(begin, pageSize);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }

    @Override
    public Page<Goods> pageByPrice(int pageNo, int pageSize, int min, int max) {
        Page<Goods> page = new Page<Goods>();
        // 设置每页显示的数量
        page.setPageSize(pageSize);
        // 求总记录数
        Integer pageTotalCount = goodsDao.queryForPageTotalCountByPrice(min, max);
        // 设置总记录数
        page.setPageTotalCount(pageTotalCount);
        // 求总页码
        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal += 1;
        }
        // 设置总页码
        page.setPageTotal(pageTotal);
        // 设置当前页码
        page.setPageNo(pageNo);
        // 求当前页数据的开始索引
        int begin = (page.getPageNo() - 1) * pageSize;
        // 求当前页数据
        List<Goods> items = goodsDao.queryForPageItemsByPrice(begin, pageSize, min, max);
        // 设置当前页数据
        page.setItems(items);
        return page;
    }
}
