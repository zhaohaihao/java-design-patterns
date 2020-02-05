package com.zhh.v3;

/**
 * @author zhh
 * @description 食品打折类
 * @date 2020-02-05 00:27
 */
public class FoodDiscount extends Food {

    public FoodDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return this.getOriginPrice() * 0.6;
    }
}
