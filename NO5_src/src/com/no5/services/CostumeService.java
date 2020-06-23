package com.no5.services;

import com.no5.pojo.Costume;

import java.util.List;

public interface CostumeService {
    /**
     * @param role_id 角色id
     * @return null 说明没有时装
     */
    public List<Costume> getCostumeInfoByRoleId(Integer role_id);

    /**
     * 保存点赞信息
     * @param user_id 用户id
     * @param costumer_id 时装id
     * @return -1说明没有更新成功
     */
    public Integer likeCostume(Integer user_id,Integer costumer_id);

    /**
     * 删除点赞信息
     * @param user_id 用户id
     * @param costumer_id 时装id
     * @return -1说明没有更新成功
     */
    public Integer disLikeCostume(Integer user_id,Integer costumer_id);
    /**
     * 查询用户点赞的时装
     * @param user_id 用户id
     * @return null 说明没有点赞的
     */
    public List<Costume> queryLikeCostumeByUserId(Integer user_id);
}
