package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.Region;

public interface RegionDao {

    List<Region> queryRegion();

    List<Region> queryRegionById(int regionId);

    int insertRegion(Region region);

    int updatedRegion(Region region);

    int deleteRegion(int regionId);
}
