package com.zhh.v1;

import java.util.Observable;

/**
 * @author zhh
 * @description 药店类
 * @date 2020-03-01 23:15
 */
public class Pharmacy extends Observable {

    /**
     * 药店名称
     */
    private String name;

    public Pharmacy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 采购
     * @param pharmacy  药店
     * @param gauzeMask 口罩
     */
    public void purchase(Pharmacy pharmacy, GauzeMask gauzeMask) {
        System.out.println(String.format("%s最近刚采购了一批%s, 数量为%s, 单价为%s", pharmacy.getName(), gauzeMask.getType(),
                gauzeMask.getAmount(), gauzeMask.getPrice()));

        // Observable 提供的方法, 代表主题状态的改变
        setChanged();

        // Observable 提供的方法, 通知所有观察者
        notifyObservers(gauzeMask);
    }
}
