package com.srv;

import com.pojo.User;

public interface UserSrv {
    public User login(String username, String pwd);

    public void insert(User user);
}
