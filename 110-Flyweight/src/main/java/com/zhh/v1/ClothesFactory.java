package com.zhh.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhh
 * @description 衣服工厂类
 * @date 2020-02-16 22:48
 */
public class ClothesFactory {

    private static final Map<String, Clothes> CLOTHES_MAP = new HashMap<String, Clothes>();

    /**
     * 获取衬衣
     * @param brand 品牌
     * @return
     */
    public static Clothes getShirt(String brand) {
        Shirt shirt = (Shirt) CLOTHES_MAP.get(brand);

        if (shirt == null) {
            shirt = new Shirt(brand);
            CLOTHES_MAP.put(brand, shirt);
            System.out.println("创建新的品牌衬衣, 品牌为: " + brand);
        }

        return shirt;
    }
}
