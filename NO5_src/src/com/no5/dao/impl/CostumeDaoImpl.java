package com.no5.dao.impl;

import com.mysql.cj.util.DnsSrv;
import com.no5.dao.CostumeDao;
import com.no5.pojo.Costume;

import java.util.List;

public class CostumeDaoImpl extends BaseDao implements CostumeDao {
    @Override
    public Costume queryByCostumeId(Integer costume_id) {
        String sql="select id, name, cover, role_id, likes, intro\n" +
                "from costumes\n" +
                "where id=?";
        return queryForOne(Costume.class,sql,costume_id);
    }

    @Override
    public List<Costume> queryByRoleId(Integer role_id) {
        String sql="select id, name, cover, role_id, likes, intro\n" +
                "from costumes\n" +
                "where role_id=?";
        return queryForList(Costume.class,sql,role_id);
    }

    @Override
    public Integer upDateLikeNumber(Integer costume_id, Integer like_number) {
        String sql="update costumes set likes=? where id=?";
        return update(sql,like_number,costume_id);
    }

    @Override
    public Integer saveLikeWithUser(Integer user_id, Integer costumer_id) {
        String sql="insert into user_costume (user_id, costume_id) values (?,?)";
        return update(sql,user_id,costumer_id);
    }

    @Override
    public Integer deleteLikeWithUser(Integer user_id, Integer costumer_id) {
        String sql="delete from user_costume\n" +
                "where user_id=? and costume_id=?";
        return update(sql,user_id,costumer_id);
    }

    @Override
    public List<Costume> queryLikeCostume(Integer user_id) {
        String sql="select c.id,c.name,c.cover,c.role_id,c.likes,c.intro\n" +
                "from user_costume join costumes c on user_costume.costume_id = c.id\n" +
                "where user_id=?";
        return queryForList(Costume.class,sql,user_id);
    }
}
