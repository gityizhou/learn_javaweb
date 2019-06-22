package com.zhouyi.store.domain;

public class Orderlineitem {
    /* 订单详细id */
    private long id;
    /* 数量 */
    private int quantity;
    /* 金额 */
    private double subTotal;
    /* 订单 */
    // 注意这里的订单和商品都是FK连接的，这里是表示一个订单或商品对象
    private Orders orders;
    /* 商品 */
    private Goods goods;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
