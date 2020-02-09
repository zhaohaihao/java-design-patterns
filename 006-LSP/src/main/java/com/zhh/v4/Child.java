package com.zhh.v4;

import java.util.HashMap;

/**
 * @author zhh
 * @description 子类
 * @date 2020-02-08 11:13
 */
public class Child extends Father {

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method方法被执行");
        hashMap.put("username", "zhaohaihao");
        return hashMap;
    }
}
