package com.dao;

import com.pojo.User;

public interface UserMybatisDao {
    User queryByUserName(String nm);

    void insert(User user);
}
