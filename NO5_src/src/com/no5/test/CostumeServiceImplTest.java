package com.no5.test;

import com.no5.services.CostumeService;
import com.no5.services.CostumeServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class CostumeServiceImplTest {

    CostumeService costumeService =new CostumeServiceImpl();
    @Test
    public void getCostumeInfoByRoleId() {
        System.out.println(costumeService.getCostumeInfoByRoleId(221324));
    }

    @Test
    public void likeCostume() {
        System.out.println(costumeService.likeCostume(123482,123456));
    }

    @Test
    public void disLikeCostume() {
        System.out.println(costumeService.disLikeCostume(123482,123456));
    }
    @Test
    public void queryLikeCostumeByUserId()
    {
        System.out.println(costumeService.queryLikeCostumeByUserId(123482));
    }
}