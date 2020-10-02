package com.shop.test;

import com.shop.bean.User;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;
import org.junit.Test;

public class UsernameExist {
    UserService userService=new UserServiceImpl();
    User user=new User();
    @Test
    public void findUsername(){

        System.out.println( userService.queryAll());
    }
}
