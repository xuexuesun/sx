package com.jd.quanttest.service.Impl;

import com.jd.quanttest.dao.UserMapper;
import com.jd.quanttest.model.User;
import com.jd.quanttest.service.Userservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sunminying1 on 2017/5/15.
 */
@Service
public class UserserviceImpl implements Userservice {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(long userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}