package com.shop.dao.Impl;


import com.shop.bean.User;
import com.shop.dao.BaseDao;
import com.shop.dao.UserDao;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryByUser(String userName, String userPassword) {
        String sql = "SELECT * FROM `shop` WHERE `username` = ? AND`password`=?;";
        return queryForOne(User.class, sql, userName, userPassword);
    }

    @Override
    public User queryByName(String userName) {
        String sql = "SELECT * FROM `shop` WHERE `username` LIKE ?;";
        return queryForOne(User.class, sql, "%" + userName + "%");
    }

    @Override
    public User queryByUserId(int Id) {
        String sql = "SELECT * FROM `shop` WHERE `userid` = ?;";
        return queryForOne(User.class, sql,Id);
    }

    @Override
    public List<User> queryAll() {
        String sql = "SELECT * FROM `shop`";
        return queryForList(User.class, sql);

    }
    @Override
    public int insert(User user) {
        int result = 0;
        String sql = "INSERT INTO `shop` (`username`,`password`,`email`) VALUES (?,?,?);";
        result = update(sql, user.getUsername(), user.getPassword(),user.getEmail());
        return result;
    }
}
