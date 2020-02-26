package com.zhh.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhh
 * @description 动态代理类
 * @date 2020-02-26 22:32
 */
public class StationDynamicProxy implements InvocationHandler {

    private Object target;

    public StationDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 模拟日志打印
        System.out.println("【日志打印】真实操作之前进行日志打印");
        return method.invoke(target, args);
    }
}
