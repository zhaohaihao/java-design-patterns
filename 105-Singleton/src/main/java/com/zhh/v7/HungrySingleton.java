package com.zhh.v7;

/**
 * @author zhh
 * @description 单例模式-饿汉式
 * @date 2020-02-12 12:59
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
