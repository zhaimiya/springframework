package org.example.srv.impl;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.srv.UserSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSrvImpl implements UserSrv {
    @Autowired
    private UserDao userDao;

    @Override
    public String login(String usrnm, String pwd) {
        System.out.println("login--");
        return userDao.login(usrnm,pwd);
    }

    @Override
    public String logout(String usrnm) {
        System.out.println("logout--");
        return userDao.logout(usrnm);
    }
}
