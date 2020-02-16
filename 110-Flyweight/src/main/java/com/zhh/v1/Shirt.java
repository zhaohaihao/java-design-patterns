package com.zhh.v1;

/**
 * @author zhh
 * @description 衬衣类
 * @date 2020-02-16 22:37
 */
public class Shirt implements Clothes {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 大小
     */
    private String size;

    /**
     * 成分
     */
    private String component;

    /**
     * 价格
     */
    private String price;

    public Shirt(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void info() {
        System.out.println(String.format("当前衬衣信息: {品牌: %s, 大小: %s, 成分: %s, 价格: %s}", brand, size, component, price));
    }
}
