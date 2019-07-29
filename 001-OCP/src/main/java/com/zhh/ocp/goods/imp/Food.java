package com.zhh.ocp.goods.imp;

import com.zhh.ocp.goods.IGoods;

/**
 * @author zhh
 * @description 食品类
 * @date 2019-07-24 00:21
 */
public class Food implements IGoods {

    private Integer id;

    private String name;

    private Double price;

    public Food(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
