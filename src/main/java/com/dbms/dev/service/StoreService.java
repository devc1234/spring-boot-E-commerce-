package com.dbms.dev.service;

import java.util.List;

import com.dbms.dev.entity.Stores;

public interface StoreService {
    List<Stores> getStoreList();

    List<Stores> getStoreById(int storeId);

    List<Stores> getStoreByName(String address);

    boolean addStore(Stores stores);

    boolean modifyStore(Stores stores);

    boolean deleteStore(int storeId);

}
