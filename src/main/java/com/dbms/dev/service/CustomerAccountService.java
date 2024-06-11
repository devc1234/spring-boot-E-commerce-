package com.dbms.dev.service;

import java.util.List;

import com.dbms.dev.entity.CustomerAccount;

public interface CustomerAccountService
{
    boolean addCustomerAccount(CustomerAccount customerAccount);
    List<CustomerAccount> searchCustomerAccount(String username);
    int countCustomer();
}
