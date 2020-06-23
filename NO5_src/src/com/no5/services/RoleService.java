package com.no5.services;

import com.no5.pojo.Role;

import java.util.List;

public interface RoleService {
    /**
     * @param id id
     * @return null说明没有角色
     */
    public Role getRoleById(Integer id);

    /**
     * @param name 名字
     * @return null说明没有角色
     */
    public Role getRoleByName(String name);

    /**
     * @return null说明没有角色
     */
    public List<Role> getHunters();

    /**
     * @return null说明没有角色
     */
    public List<Role> getSurvivors();
}
