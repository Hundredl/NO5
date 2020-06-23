package com.no5.dao.impl;

import com.no5.dao.RoleDao;
import com.no5.pojo.Role;

import java.util.List;

public class RoleDaoImpl extends BaseDao implements RoleDao {
    @Override
    public Role queryRoleFromId(Integer id) {
        String sql="select id, name, cover, intro, num\n" +
                "from roles where id=?";
        return queryForOne(Role.class,sql,id);
    }

    @Override
    public List<Role> queryRolesFromNum(Integer num) {
        String sql="select id, name, cover, intro, num\n" +
                "from roles where num=?";
        return queryForList(Role.class,sql,num);
    }

    @Override
    public Role queryRoleFromName(String name) {
        String sql="select id, name, cover, intro, num\n" +
                "from roles where name=?";
        return queryForOne(Role.class,sql,name);
    }

    @Override
    public List<Role> queryRoleFromNumIsNot(Integer num) {
        String sql="select id, name, cover, intro, num\n" +
                "from roles where num!=?";
        return queryForList(Role.class,sql,num);
    }
}
