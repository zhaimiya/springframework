package com.srv;

import com.pojo.User;

public interface UserMyBatisSrv {
    public User login(String username, String pwd);

    public void insert(User user);
}
