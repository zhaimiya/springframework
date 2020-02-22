package org.example.dao;

public interface UserDao {
    String login(String usrNm,String pwd);
    String logout(String usrNm);
}
