package com.lgh.service.impl;

import com.lgh.dao.IUserDao;
import com.lgh.entity.User;
import com.lgh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    @Override
    public void testAdd(User user) {
        iUserDao.testAdd(user);
    }
}
