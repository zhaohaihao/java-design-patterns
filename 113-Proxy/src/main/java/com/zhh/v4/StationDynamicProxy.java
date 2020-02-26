package com.zhh.v4;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhh
 * @description 动态代理类
 * @date 2020-02-26 22:32
 */
public class StationDynamicProxy implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 模拟日志打印
        System.out.println("【日志打印】真实操作之前进行日志打印");
        return methodProxy.invokeSuper(o, objects);
    }
}
