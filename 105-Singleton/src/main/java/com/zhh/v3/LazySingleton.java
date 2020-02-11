package com.zhh.v3;

/**
 * @author zhh
 * @description 单例模式-懒汉式
 * @date 2020-02-11 19:56
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
