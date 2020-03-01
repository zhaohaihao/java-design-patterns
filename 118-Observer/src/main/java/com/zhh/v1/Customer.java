package com.zhh.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhh
 * @description 顾客类
 * @date 2020-03-01 23:20
 */
public class Customer implements Observer {

    /**
     * 姓名
     */
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Pharmacy pharmacy = (Pharmacy) o;
        GauzeMask gauzeMask = (GauzeMask) arg;
        System.out.println(String.format("顾客%s收到%s的通知: 最近刚采购了一批%s, 数量为%s, 单价为%s", this.name, pharmacy.getName(),
                gauzeMask.getType(), gauzeMask.getAmount(), gauzeMask.getPrice()));
    }
}
