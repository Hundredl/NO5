package com.no5.test;

import com.no5.pojo.User;
import com.no5.services.UserService;
import com.no5.services.UserServicesImpl;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServicesImplTest {
    UserService userService=new UserServicesImpl();

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void queryUserByAccount() {
        System.out.println(userService.queryUserByAccount("April"));

    }

    @Test
    public void queryUserById() {
        System.out.println(userService.queryUserById(123482));
    }

    @Test
    public void queryUserByAccountAndPassword() {
        System.out.println(userService.queryUserByAccountAndPassword("April","1234"));
    }

    @Test
    public void saveUser() {
        System.out.println(userService.saveUser(new User(null,"小天才","1234","天才")));
    }

    @Test
    public void saveUserName() {
        System.out.println(userService.saveUserName(new User(null,"Happy",null,"Helen")));
    }

    @Test
    public void saveUserPassword() {
        System.out.println(userService.saveUserPassword(new User(null,null,"1234","April") ));
    }
}