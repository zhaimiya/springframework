package com.srv.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.srv.UserSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSrvImpl implements UserSrv {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String pwd) {
        System.out.println("UserSrvImpl.login   username: "+username+" pwd： "+pwd);
        User user = userDao.queryByUserName(username);
        if (null != user) {
            if (user.getPwd().equals(pwd)) {
                return user;
            }
        }
//        throw  new ExportException();
        return null;
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
