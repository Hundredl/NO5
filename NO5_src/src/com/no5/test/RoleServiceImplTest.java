package com.no5.test;

import com.mysql.cj.jdbc.SuspendableXAConnection;
import com.no5.services.RoleService;
import com.no5.services.RoleServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleServiceImplTest {

    RoleService roleService =new RoleServiceImpl();
    @Test
    public void getRoleById() {
        System.out.println(roleService.getRoleById(221329));
    }

    @Test
    public void getRoleByName() {
        System.out.println(roleService.getRoleByName("厂长"));
    }

    @Test
    public void getHunters() {
        System.out.println(roleService.getHunters());
    }

    @Test
    public void getSurvivors() {
        System.out.println(roleService.getSurvivors());
    }
    @Test
    public  void modifyCover()
    {

    }
}