package com.zhh.simple.factory;

/**
 * @author zhh
 * @description 测试类
 * @date 2019-10-12 00:32
 */
public class Test {

    public static void main(String[] args) {
        // Phone phone = PhoneFactory.getPhone("iphone");
        Phone phone = PhoneFactory.getPhone(IPhone.class);
        if (phone != null) {
            phone.call();
        } else {
            System.out.println("无此手机类型...");
        }
    }
}
