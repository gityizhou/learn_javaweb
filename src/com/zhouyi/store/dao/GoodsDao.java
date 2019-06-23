package com.zhouyi.store.dao;

import com.zhouyi.store.domain.Goods;
import com.zhouyi.store.domain.Orders;

import java.util.List;

public interface GoodsDao {

    Goods findByPk(String pk);

    List<Goods> findAll();

    void create(Goods goods);

    void modify(Goods goods);

    void remove(String pk);
}
