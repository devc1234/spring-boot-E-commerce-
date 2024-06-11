package com.dbms.dev.service;


import java.util.List;

import com.dbms.dev.entity.Region;

public interface RegionService {
    List<Region> getRegionList();

    List<Region> getRegionById(int regionId);

    boolean addRegion(Region region);

    boolean modifyRegion(Region region);

    boolean deleteRegion(int regionId);

}
