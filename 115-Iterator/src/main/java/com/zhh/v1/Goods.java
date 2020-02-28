package com.zhh.v1;

/**
 * @author zhh
 * @description 商品实体类
 * @date 2020-02-28 14:20
 */
public class Goods {

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
