package com.no5.dao;

import com.no5.pojo.Costume;

import java.util.List;

public interface CostumeDao {
    /**
     * 查询时装信息
     * @param costume_id  时装id
     * @return null说明无时装
     */
    public Costume queryByCostumeId(Integer costume_id);
    /**
     * @param role_id 角色id
     * @return null 说明没有时装
     */
    public List<Costume> queryByRoleId(Integer role_id);

    /**
     * @param costume_id 时装id
     * @param like_number 时装新点赞数
     * @return -1说明没有更新成功
     */
    public Integer upDateLikeNumber(Integer costume_id,Integer like_number);

    /**
     * 保存点赞信息
     * @param user_id 用户id
     * @param costumer_id 时装id
     * @return -1说明没有更新成功
     */
    public Integer saveLikeWithUser(Integer user_id,Integer costumer_id);

    /**
     * 删除点赞信息
     * @param user_id 用户id
     * @param costumer_id 时装id
     * @return -1说明没有更新成功
     */
    public Integer deleteLikeWithUser(Integer user_id,Integer costumer_id);

    /**
     * 查询用户点赞的时装
     * @param user_id 用户id
     * @return null 说明没有点赞的
     */
    public List<Costume> queryLikeCostume(Integer user_id);
}
