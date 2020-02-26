package com.zhh.v4;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-26 21:54
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ZhuJiStation.class);
        enhancer.setCallback(new StationDynamicProxy());
        ZhuJiStation proxy = (ZhuJiStation) enhancer.create();
        proxy.setUsername("海豪");
        proxy.setStart("诸暨");
        proxy.setEnd("杭州");
        proxy.buy();
    }
}
