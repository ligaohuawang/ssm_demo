package com.lgh.dao.impl;

import com.lgh.dao.IUserDao;
import com.lgh.entity.User;
import com.lgh.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IUserDaoimpl extends SqlSessionDaoSupport implements IUserDao {

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public void testAdd(User user) {
        //1.获得代理对象
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        //2.调用方法
        userMapper.testAdd(user);
    }
}
