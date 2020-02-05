package com.zhh.v3;

/**
 * @author zhh
 * @description 食品类
 * @date 2020-02-04 23:42
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

    public Double getDiscountPrice() {
        return getPrice() * 0.6;
    }
}
