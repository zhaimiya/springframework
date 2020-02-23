package com.dao.impl;

import com.dao.UserDao;
import com.mapper.UserMapper;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public User queryByUserName(String nm) {
        String  sql = "select ID,NAME,pwd from user where NAME=?";
        System.out.println("UserDaoImpl.queryByUserName  NAME= "+nm);
        List<User> list = jdbcTemplate.query(sql,new Object[]{nm},new UserMapper());
        if(null!=list && 0<list.size()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void insert(User user) {

    }
}
