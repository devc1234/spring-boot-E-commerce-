package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.Stores;

public interface StoreDao {

    List<Stores> queryStore();

    List<Stores> queryStoreById(int storeId);

    List<Stores> queryStoreByName(String address);

    int insertStore(Stores store);

    int updatedStore(Stores store);

    int deleteStore(int storeId);
}
