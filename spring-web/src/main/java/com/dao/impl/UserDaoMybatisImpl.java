package com.dao.impl;

import com.dao.UserMybatisDao;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserMybatisDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public User queryByUserName(String username) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMybatisDao userMybatisDao = sqlSession.getMapper(UserMybatisDao.class);//userDao实例
        return userMybatisDao.queryByUserName(username);
    }

    @Override
    public void insert(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMybatisDao userMybatisDao = sqlSession.getMapper(UserMybatisDao.class);//获取到userDao实例
        userMybatisDao.insert(user);
    }
}
