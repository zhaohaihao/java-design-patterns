package com.zhh.v3;

/**
 * @author zhh
 * @description 人物类
 * @date 2020-02-05 20:29
 */
public class Person {

    private IGoods iGoods;

    public Person(IGoods iGoods) {
        this.iGoods = iGoods;
    }

    public void buyGood() {
        iGoods.buyGood();
    }
}
