package com.zhh.v1;

/**
 * @author zhh
 * @description 口罩类
 * @date 2020-03-01 23:17
 */
public class GauzeMask {

    /**
     * 种类
     */
    private String type;

    /**
     * 数量
     */
    private int amount;

    /**
     * 价格
     */
    private double price;

    public GauzeMask(String type, int amount, double price) {
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
