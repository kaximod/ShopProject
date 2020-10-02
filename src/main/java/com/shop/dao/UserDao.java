package com.shop.dao;

import com.shop.bean.User;

import java.util.List;

public interface UserDao {
    User queryByUser(String userName, String userPassword);
    User queryByName(String userName);
    List<User> queryAll();
    int insert(User user);
}
