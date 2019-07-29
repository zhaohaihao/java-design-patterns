package com.zhh.ocp.goods.imp;

/**
 * @author zhh
 * @description 食品打折类
 * @date 2019-07-24 01:09
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
