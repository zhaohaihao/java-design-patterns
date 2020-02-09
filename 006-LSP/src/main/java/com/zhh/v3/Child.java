package com.zhh.v3;

import java.util.HashMap;

/**
 * @author zhh
 * @description 子类
 * @date 2020-02-07 16:51
 */
public class Child extends Father {

    // 重载方法
    public void method(HashMap hashMap) {
        System.out.println("子类HashMap被执行");
    }
}
