package com.shop.test;

import com.shop.bean.Cart;
import com.shop.service.CartService;
import com.shop.service.Impl.CartServiceImpl;
import org.junit.Test;

import java.util.List;

public class CartTest {
    CartService cartService=new CartServiceImpl();
    @Test
    public void text1(){
       List<Cart> CartList= cartService.queryAll();
        for (int i = 0; i <CartList.size() ; i++) {
            System.out.println(CartList.get(i).getPrice());
        }
    }
}
