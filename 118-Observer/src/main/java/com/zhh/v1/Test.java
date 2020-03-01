package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-01 23:46
 */
public class Test {

    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy("一方大药房");
        GauzeMask gauzeMask = new GauzeMask("一次性口罩", 5000, 4.8);

        Customer customer1 = new Customer("海豪");
        Customer customer2 = new Customer("亚萍");
        pharmacy.addObserver(customer1);
        pharmacy.addObserver(customer2);

        pharmacy.purchase(pharmacy, gauzeMask);
    }
}
