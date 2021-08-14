package org.richard.service;

import org.richard.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
