package com.dbms.dev.dao;

import java.util.List;

import com.dbms.dev.entity.Customer;

public interface CustomerDao {
    List<Customer> queryCustomer();

    List<Customer> queryCustomerByName(String firstName);

    int insertCustomer(Customer customer);

    int queryCountCustomer();
}
