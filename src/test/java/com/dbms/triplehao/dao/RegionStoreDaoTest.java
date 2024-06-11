package com.dbms.triplehao.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbms.dev.dao.RegionStoreDao;
import com.dbms.dev.entity.RegionStore;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionStoreDaoTest {
    @Autowired
    private RegionStoreDao regionStoreDao;

    @Test
    @Ignore
    public void queryRegionStore() {
        List<RegionStore> regionStoreList = regionStoreDao.queryRegionStore();
        assertEquals(0, regionStoreList.size());
    }
}
