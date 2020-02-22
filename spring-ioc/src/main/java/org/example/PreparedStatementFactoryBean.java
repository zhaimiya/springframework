package org.example;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PreparedStatementFactoryBean implements FactoryBean<PreparedStatement> {
    /**
     * 生成实例的过程
     * @return
     * @throws Exception
     */
    @Override
    public PreparedStatement getObject() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/XI?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8","root","1234");
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM USER");
        return ps;
    }

    /**
     * 生成实例类型，此方法为兼容老版本的代码
     * @return：实例类型
     */
    @Override
    public Class<?> getObjectType() {
        return PreparedStatement.class;
    }

    /**
     * 是否单例
     * true:单例，false:非单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
