package com.shop.service;

import com.shop.bean.User;

import java.util.List;

public interface UserService {
    User queryByUser(String userName, String userPassword);
    User queryByName(String userName);
    User queryById(int Id);
     List<User> queryAll();
    int insert(User user);

}
