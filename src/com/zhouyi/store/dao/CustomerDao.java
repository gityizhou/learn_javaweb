package com.zhouyi.store.dao;

import com.zhouyi.store.domain.Customer;

import java.util.List;

public interface CustomerDao {

    Customer findByPk(String pk);

    List<Customer> findAll();

    void create(Customer customer);

    void modify(Customer customer);

    void remove(String pk);

}
