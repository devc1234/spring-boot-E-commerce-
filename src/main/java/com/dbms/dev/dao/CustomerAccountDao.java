package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.CustomerAccount;

public interface CustomerAccountDao
{
    int insertCustomerAccount(CustomerAccount customerAccount);
    List<CustomerAccount> searchCustomerAccount(String username);
    int queryCountCustomer();

}
