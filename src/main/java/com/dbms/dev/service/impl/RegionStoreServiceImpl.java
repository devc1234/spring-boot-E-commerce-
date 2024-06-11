package com.dbms.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbms.dev.dao.RegionStoreDao;
import com.dbms.dev.entity.RegionStore;
import com.dbms.dev.service.RegionStoreService;

import java.util.List;

@Service
public class RegionStoreServiceImpl implements RegionStoreService {
    @Autowired
    private RegionStoreDao regionStoreDao;

    @Override
    public List<RegionStore> getRegionStoreList() {
        return regionStoreDao.queryRegionStore();
    }

}
