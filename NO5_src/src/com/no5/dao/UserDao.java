package com.no5.dao;

import com.no5.pojo.User;

public interface UserDao {
    /**
     * @param account 账户
     * @return null 说明没有这个账户
     */
    public User queryUserByAccount(String account);

    /**
     * 查询用户
     * @param user_id 用户id
     * @return null说明没有这个用户id
     */
    public User queryUserById(Integer user_id);

    /**
     * 查询账户密码
     * @param account 账户
     * @param password 密码
     * @return null 说明密码不匹配或者不存在
     */
    public User queryUserByAccountAndPassword(String account ,String password);

    /**
     * 保存用户信息
     * @param user 用户
     * @return 返回-1说明操作失败，其他表示语句影响行数
     */
    public Integer saveUser(User user);

    /**
     * @param user 用户
     * @return 返回-1说明没有成功
     */
    public Integer saveUserName(User user);

    /**
     * 修改密码
     * @param user 用户
     * @return 返回-1说明没有成功
     */
    public Integer saveUserPassword(User user);
}
