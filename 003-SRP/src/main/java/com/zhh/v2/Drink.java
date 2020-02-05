package com.zhh.v2;

/**
 * @author zhh
 * @description 饮料类
 * @date 2020-02-05 22:23
 */
public class Drink {

    /**
     * 饮料类型
     * @param drinkName 饮料名称
     */
    public void type(String drinkName) {
        if ("牛奶".equals(drinkName)) {
            System.out.println(drinkName + "是奶制品");
        } else {
            System.out.println(drinkName + "是汽水");
        }
    }
}
