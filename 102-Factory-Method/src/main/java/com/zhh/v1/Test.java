package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-10 11:11
 */
public class Test {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new IPhoneFactory();
        Phone phone = phoneFactory.getPhone();
        phone.call();
    }
}
