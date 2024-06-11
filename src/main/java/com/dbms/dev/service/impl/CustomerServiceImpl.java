package com.dbms.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbms.dev.dao.CustomerDao;
import com.dbms.dev.entity.Customer;
import com.dbms.dev.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getCustomerList()
    {
        return customerDao.queryCustomer();
    }

    @Override
    public List<Customer> getCustomerByName(String firstName)
    {
        return customerDao.queryCustomerByName(firstName);
    }


    @Override
    public int getCountCustomer()
    {
        return customerDao.queryCountCustomer();
    }
}
