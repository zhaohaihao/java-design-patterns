package com.zhh.v1;

import java.util.Random;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-16 23:04
 */
public class Test {

    private static final String[] BRAND = {"YOUNGOR雅戈尔", "FIRS杉杉", "ROMON罗蒙", "Hodo红豆"};

    private static final String[] SIZE = {"S", "M", "L", "XL", "XXL"};

    private static final String[] COMPONENT = {"棉", "涤纶", "真丝"};

    private static final String[] PRICE = { "￥99", "￥129", "￥149", "￥199" };

    /**
     * 随机模拟
     * @param strs 随机模拟数组
     * @return
     */
    public static String getRandom(String[] strs) {
        return strs[new Random().nextInt(strs.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Shirt shirt = (Shirt) ClothesFactory.getShirt(getRandom(BRAND));
            shirt.setSize(getRandom(SIZE));
            shirt.setComponent(getRandom(COMPONENT));
            shirt.setPrice(getRandom(PRICE));
            shirt.info();
        }
    }
}
