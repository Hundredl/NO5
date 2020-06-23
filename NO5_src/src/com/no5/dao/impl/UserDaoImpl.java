package com.no5.dao.impl;

import com.no5.dao.UserDao;
import com.no5.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByAccount(String account) {
        String sql="select id, username, password, account\n" +
                "from users\n" +
                "where account=?";
        return queryForOne(User.class,sql,account);
    }

    @Override
    public User queryUserById(Integer user_id) {

        String sql="select id, username, password, account\n" +
                "from users\n" +
                "where user_id=?";
        return queryForOne(User.class,sql,user_id);
    }

    @Override
    public User queryUserByAccountAndPassword(String account, String password) {
        String sql="select id, username, password, account\n" +
                "from users\n" +
                "where account=? and password=?";
        return queryForOne(User.class,sql,account,password);
    }

    @Override
    public Integer saveUser(User user) {
        String sql="insert into users (username, password, account) VALUES (? , ? , ?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getAccount());
    }

    @Override
    public Integer saveUserName(User user) {
        String sql="update users set username=? where account=?";
        return update(sql,user.getUsername(),user.getAccount());
    }

    @Override
    public Integer saveUserPassword(User user) {
        String sql="update users set password=? where account=?";
        return update(sql,user.getPassword(),user.getAccount());
    }
}
