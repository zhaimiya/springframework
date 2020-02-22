package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public String login(String usrNm, String pwd) {
        System.out.println("UserDaoImpl login");
        return "login successful!";
    }

    @Override
    public String logout(String usrNm) {
        System.out.println("UserDaoImpl logout");
        return "logout";
    }
}
