package com.zhh.v6;

/**
 * @author zhh
 * @description 静态内部类单例模式
 * @date 2020-02-12 01:36
 */
public class StaticInnerClassSingleton {

    private static class SingletonHolder {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {}

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
