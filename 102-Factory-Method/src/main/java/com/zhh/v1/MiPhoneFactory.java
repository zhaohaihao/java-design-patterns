package com.zhh.v1;

/**
 * @author zhh
 * @description 小米手机工厂类
 * @date 2020-02-10 15:12
 */
public class MiPhoneFactory implements PhoneFactory {

    public Phone getPhone() {
        return new MiPhone();
    }
}
