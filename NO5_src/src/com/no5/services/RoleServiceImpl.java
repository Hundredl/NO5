package com.no5.services;

import com.no5.dao.RoleDao;
import com.no5.dao.impl.RoleDaoImpl;
import com.no5.pojo.Role;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    RoleDao roleDao =new RoleDaoImpl();
    @Override
    public Role getRoleById(Integer id) {
        return roleDao.queryRoleFromId(id);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.queryRoleFromName(name);
    }

    @Override
    public List<Role> getHunters() {
        return roleDao.queryRolesFromNum(-1);
    }

    @Override
    public List<Role> getSurvivors() {
        return roleDao.queryRoleFromNumIsNot(-1);
    }

}

