package com.zhh.v5;

/**
 * @author zhh
 * @description 单例模式-懒汉式(双重检查)
 * @date 2020-02-11 19:56
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
