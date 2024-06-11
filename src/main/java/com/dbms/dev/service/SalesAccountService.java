package com.dbms.dev.service;
import java.util.List;

import com.dbms.dev.entity.SalesAccount;

public interface SalesAccountService {

    boolean addSalesAccount(SalesAccount salesAccount);
    List<SalesAccount> searchSalesAccount(String username);
}
