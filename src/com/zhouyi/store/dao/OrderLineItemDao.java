package com.zhouyi.store.dao;

import com.zhouyi.store.domain.OrderLineItem;

import java.util.List;

public interface OrderLineItemDao {

    OrderLineItem findByPk(String pk);

    List<OrderLineItem> findAll();

    void create(OrderLineItem lineItem);

    void modify(OrderLineItem lineItem);

    void remove(String pk);
}
