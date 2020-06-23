package com.no5.test;

import com.no5.dao.UserDao;
import com.no5.dao.impl.UserDaoImpl;
import com.no5.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    UserDao userDao=new UserDaoImpl();
    @Test
    public void queryUserByAccount() {
        System.out.println(userDao.queryUserByAccount("April"));
    }

    @Test
    public void queryUserById() {
        System.out.println(userDao.queryUserById(123482));
    }

    @Test
    public void queryUserByAccountAndPassword() {
        System.out.println(userDao.queryUserByAccountAndPassword("April","12345"));
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"Helen","1234","Helen")));
    }

    @Test
    public void saveUserName() {
        System.out.println(userDao.saveUserName(new User(null,"Happy",null,"Helen")));
    }

    @Test
    public void saveUserPassword() {
        System.out.println(userDao.saveUserPassword(new User(null,null,"1234","April") ));
    }
}