package com.mapper;

import com.pojo.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("pwd"));
    }
}
