package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-10 11:11
 */
public class Test {

    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhone(IPhone.class);
        if (phone != null) {
            phone.call();
        } else {
            System.out.println("无此手机品牌类型");
        }
    }
}
