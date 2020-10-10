package com.shop.bean;

import java.math.BigDecimal;

public class Cart {
    private int cartId;
    private int userId;
    private int goodId;
    private  String cartName;
    private int cartNum;
    private BigDecimal cartPrice;
    private BigDecimal cartPriceTotal;

    public Cart() {
    }

    public Cart(int cartId, int userId, int goodId, String cartName, int cartNum, BigDecimal cartPrice, BigDecimal cartPriceTotal) {
        this.cartId = cartId;
        this.userId = userId;
        this.goodId = goodId;
        this.cartName = cartName;
        this.cartNum = cartNum;
        this.cartPrice = cartPrice;
        this.cartPriceTotal = cartPriceTotal;
    }

    public Cart(int goodId, int userId, String cartName, int cartNum, BigDecimal cartPrice, BigDecimal cartPriceTotal) {
        this.goodId=goodId;
        this.userId=userId;
        this.cartName=cartName;
        this.cartNum=cartNum;
        this.cartPrice=cartPrice;
        this.cartPriceTotal=cartPriceTotal;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public int getCartNum() {
        return cartNum;
    }

    public void setCartNum(int cartNum) {
        this.cartNum = cartNum;
    }

    public BigDecimal getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(BigDecimal cartPrice) {
        this.cartPrice = cartPrice;
    }

    public BigDecimal getCartPriceTotal() {
        return cartPriceTotal;
    }

    public void setCartPriceTotal(BigDecimal cartPriceTotal) {
        this.cartPriceTotal = cartPriceTotal;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", goodId=" + goodId +
                ", cartName='" + cartName + '\'' +
                ", cartNum=" + cartNum +
                ", cartPrice=" + cartPrice +
                ", cartPriceTotal=" + cartPriceTotal +
                '}';
    }
}
