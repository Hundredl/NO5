package com.no5.test;

import com.no5.dao.CostumeDao;
import com.no5.dao.impl.CostumeDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class CostumeDaoImplTest {
    CostumeDao costumeDao= new CostumeDaoImpl();

    @Test
    public void queryByCostumeId()
    {
        System.out.println(costumeDao.queryByCostumeId(123456));
    }
    @Test
    public void queryByRoleId() {
        System.out.println(costumeDao.queryByRoleId(221324));
    }

    @Test
    public void upDateLikeNumber() {
        System.out.println(costumeDao.upDateLikeNumber(123456,0));
    }

    @Test
    public void saveLikeWithUser() {
        System.out.println(costumeDao.saveLikeWithUser(123482,123457));
    }

    @Test
    public void deleteLikeWithUser() {
        System.out.println(costumeDao.deleteLikeWithUser(123482,123457));
    }

    @Test
    public void  queryLikeCostume()
    {
        System.out.println(costumeDao.queryLikeCostume(123482));
    }

}