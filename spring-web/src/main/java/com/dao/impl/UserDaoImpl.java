package com.dao.impl;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User queryByUserName(String nm) {
        User user = new User();
        user.setUsername(nm);
        user.setPwd("1234");
        return user;
    }
}
