package org.richard.service;

import org.richard.dao.UserDao;
import org.richard.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
