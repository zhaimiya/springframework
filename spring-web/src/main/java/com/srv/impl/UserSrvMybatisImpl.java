package com.srv.impl;

import com.dao.UserMybatisDao;
import com.pojo.User;
import com.srv.UserMyBatisSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSrvMybatisImpl implements UserMyBatisSrv {

    @Autowired
    private UserMybatisDao userMybatisDao;

    @Override
    public User login(String username, String pwd) {

        return null;
    }

    @Override
    public void insert(User user) {
        userMybatisDao.insert(user);
    }
}
