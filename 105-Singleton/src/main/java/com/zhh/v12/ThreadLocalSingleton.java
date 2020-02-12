package com.zhh.v12;

/**
 * @author zhh
 * @description ThreadLocal线程单例
 * @date 2020-02-12 17:03
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {
        // 重写初始化方法
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }
}
