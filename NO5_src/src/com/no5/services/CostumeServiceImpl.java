package com.no5.services;

import com.no5.dao.CostumeDao;
import com.no5.dao.impl.CostumeDaoImpl;
import com.no5.pojo.Costume;

import java.util.List;

public class CostumeServiceImpl implements CostumeService {
    CostumeDao costumeDao=new CostumeDaoImpl();
    @Override
    public List<Costume> getCostumeInfoByRoleId(Integer role_id) {
        return costumeDao.queryByRoleId(role_id);
    }

    @Override
    public Integer likeCostume(Integer user_id, Integer costumer_id) {
        /*更新user_costume表*/
        Integer result=costumeDao.saveLikeWithUser(user_id,costumer_id);
        if(result.equals(1))
        {
            /*更新costumes表*/
            Costume costume=costumeDao.queryByCostumeId(costumer_id);
            costumeDao.upDateLikeNumber(costumer_id,costume.getLikes()+1);
            return 1;
        }
        else
        {
            /*说明已经点过赞了*/
            /*无需更新costumes表*/
            return -1;
        }

    }

    @Override
    public Integer disLikeCostume(Integer user_id, Integer costumer_id) {
        /*更新user_costume表*/
        Integer result = costumeDao.deleteLikeWithUser(user_id, costumer_id);
        if (result.equals(1)) {
            /*更新costumes表*/
            Costume costume = costumeDao.queryByCostumeId(costumer_id);
            costumeDao.upDateLikeNumber(costumer_id, costume.getLikes() - 1);
            return 1;
        } else {
            /*说明本来就没点过赞，不用取消*/
            /*无需更新costumes表*/
            return -1;
        }
    }

    @Override
    public List<Costume> queryLikeCostumeByUserId(Integer user_id) {
        return costumeDao.queryLikeCostume(user_id);
    }
}
