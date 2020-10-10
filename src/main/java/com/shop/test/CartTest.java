package com.shop.test;

import com.shop.bean.Cart;
import com.shop.service.CartService;
import com.shop.service.Impl.CartServiceImpl;
import org.junit.Test;

import java.util.List;

public class CartTest {
    CartService cartService=new CartServiceImpl();
    Cart cart=new Cart();
    @Test
    public void text1(){
       List<Cart> CartList= cartService.queryAll();
        for (Cart cart : CartList) {
            System.out.println(cart);
        }
    }
}
