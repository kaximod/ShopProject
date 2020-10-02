package com.shop.bean;

import java.math.BigDecimal;

public class Cart {
    private int cartId;
    private int userId;
    private  String cartName;
    private int cartNum;
    private BigDecimal Price;
    private BigDecimal PriceTotal;

    public Cart() {
    }

    public Cart(int cartId, int userId, String cartName, int cartNum, BigDecimal price, BigDecimal priceTotal) {
        this.cartId = cartId;
        this.userId = userId;
        this.cartName = cartName;
        this.cartNum = cartNum;
        Price = price;
        PriceTotal = priceTotal;
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

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public BigDecimal getPriceTotal() {
        return PriceTotal;
    }

    public void setPriceTotal(BigDecimal priceTotal) {
        PriceTotal = priceTotal;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", cartName='" + cartName + '\'' +
                ", cartNum=" + cartNum +
                ", Price=" + Price +
                ", PriceTotal=" + PriceTotal +
                '}';
    }
}
