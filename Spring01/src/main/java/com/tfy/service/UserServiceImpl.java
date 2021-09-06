package com.tfy.service;

import com.tfy.dao.UserDao;
import com.tfy.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
