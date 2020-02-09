package com.zhh.v2;

import java.util.Map;

/**
 * @author zhh
 * @description 子类
 * @date 2020-02-07 16:51
 */
public class Child extends Father {

    // 重载方法
    public void method(Map map) {
        System.out.println("子类Map被执行");
    }
}
