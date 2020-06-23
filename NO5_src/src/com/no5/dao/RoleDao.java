package com.no5.dao;

import com.no5.pojo.Role;

import java.util.List;

public interface RoleDao {

    /**
     * @param id 角色id
     * @return 返回null说明没有角色
     */
    public Role queryRoleFromId(Integer id);

    /**
     * @param num 角色分类
     * @return null说明分类下没有角色
     */
    public List<Role> queryRolesFromNum(Integer num);

    /**
     * @param name 角色名称
     * @return null说明没有角色
     */
    public Role queryRoleFromName(String name);

    /**
     * 选择不是num类型的
     * @param num num
     * @return null说明没有角色
     */
    public List<Role> queryRoleFromNumIsNot(Integer num);
}
