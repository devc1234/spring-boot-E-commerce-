package com.dbms.dev.service;

import java.util.List;

import com.dbms.dev.entity.Customer;

public interface CustomerService {
    List<Customer> getCustomerList();

    List<Customer> getCustomerByName(String name);

//    boolean addCustomer(Customer customer);

    int getCountCustomer();
}

