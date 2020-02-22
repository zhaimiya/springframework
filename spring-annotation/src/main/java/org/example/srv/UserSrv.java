package org.example.srv;

public interface UserSrv {
    String login(String usrnm,String pwd);

    String logout(String usrnm);
}
