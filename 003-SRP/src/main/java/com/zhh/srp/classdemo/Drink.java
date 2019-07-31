package com.zhh.srp.classdemo;

/**
 * @author zhh
 * @description 饮料类
 * @date 2019-07-31 00:42
 */
public class Drink {

    /**
     * 饮料类型
     */
    public void type(String drinkName) {
        if ("牛奶".equals(drinkName)) {
            System.out.println(drinkName + "是奶制品");
        } else {
            System.out.println(drinkName + "是汽水");
        }
    }
}
