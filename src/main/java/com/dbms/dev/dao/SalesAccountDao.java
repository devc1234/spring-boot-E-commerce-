package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.SalesAccount;


public interface SalesAccountDao {

    //login
    List<SalesAccount> searchSalesAccount(String username);

    //register
    int insertSalesAccount(SalesAccount salesAccount);

//    int updatedSalesAccount(SalesAccount salesAccount);
//
//    int deleteSalesAccount(int empId);

}
