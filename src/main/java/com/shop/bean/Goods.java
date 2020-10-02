package com.shop.bean;

import java.math.BigDecimal;

public class Goods {
    private int goodId;
    private String goodName;
    private String goodBrand;
    private BigDecimal goodPrice;
    private int goodSales;
    private int goodStock;
    private String goodImg;

    public Goods() {
    }

    public Goods(int goodId, String goodName, String goodBrand, BigDecimal goodPrice, int goodSales, int goodStock, String goodImg) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodBrand = goodBrand;
        this.goodPrice = goodPrice;
        this.goodSales = goodSales;
        this.goodStock = goodStock;
        this.goodImg = goodImg;
    }

    public Goods(String goodName, BigDecimal goodPrice, String goodBrand, int goodSales, int goodStock) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodBrand = goodBrand;
        this.goodSales = goodSales;
        this.goodStock = goodStock;
    }


    public Goods(String goodName, BigDecimal goodPrice,String goodBrand,  int goodSales, int goodStock, int goodId) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodBrand = goodBrand;
        this.goodPrice = goodPrice;
        this.goodSales = goodSales;
        this.goodStock = goodStock;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodSales() {
        return goodSales;
    }

    public void setGoodSales(int goodSales) {
        this.goodSales = goodSales;
    }

    public int getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(int goodStock) {
        this.goodStock = goodStock;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodBrand='" + goodBrand + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodSales=" + goodSales +
                ", goodStock=" + goodStock +
                ", goodImg='" + goodImg + '\'' +
                '}';
    }
}
