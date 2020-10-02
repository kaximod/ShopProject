package com.shop.service.Impl;

import com.shop.bean.User;
import com.shop.dao.Impl.UserDaoImpl;
import com.shop.dao.UserDao;
import com.shop.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public User queryByUser(String userName, String userPassword) {
        return userDao.queryByUser(userName,userPassword);
    }

    @Override
    public User queryByName(String userName) {
        return userDao.queryByName(userName);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

}
