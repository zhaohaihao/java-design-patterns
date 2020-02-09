package com.zhh.v3;

import java.util.HashMap;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-07 16:53
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
