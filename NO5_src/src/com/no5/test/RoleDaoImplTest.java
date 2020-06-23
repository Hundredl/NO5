package com.no5.test;

import com.no5.dao.RoleDao;
import com.no5.dao.impl.RoleDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleDaoImplTest {

    RoleDao roleDao=new RoleDaoImpl();
    @Test
    public void queryRoleFromId() {
        System.out.println(roleDao.queryRoleFromId(221329));
    }

    @Test
    public void queryRolesFromNum() {
        System.out.println(roleDao.queryRolesFromNum(-1));
    }

    @Test
    public void queryRoleFromName() {
        System.out.println(roleDao.queryRoleFromName("厂长"));
    }

    @Test
    public void queryRoleFromNumIsNot() {
        System.out.println(roleDao.queryRoleFromNumIsNot(-1));
    }
}