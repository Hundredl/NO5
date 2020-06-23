package com.no5.services;

import com.no5.dao.UserDao;
import com.no5.dao.impl.UserDaoImpl;
import com.no5.pojo.User;

public class UserServicesImpl implements UserService{

    UserDao userDao=new UserDaoImpl();
    @Override
    public User queryUserByAccount(String account) {
        return userDao.queryUserByAccount(account);
    }

    @Override
    public User queryUserById(Integer user_id) {
        return userDao.queryUserById(user_id);
    }

    @Override
    public User queryUserByAccountAndPassword(String account, String password) {
        return userDao.queryUserByAccount(account);
    }

    @Override
    public Integer saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public Integer saveUserName(User user) {
        return userDao.saveUserName(user);
    }

    @Override
    public Integer saveUserPassword(User user) {
        return userDao.saveUserPassword(user);
    }
}
