package com.zhh.v1;

/**
 * @author zhh
 * @description 手机工厂类
 * @date 2020-02-10 11:09
 */
public class PhoneFactory {

    /**
     * 获取手机
     * @param type 手机品牌类型
     * @return
     */
    public static Phone getPhone(String type) {
        if ("iphone".equalsIgnoreCase(type)) {
            return new IPhone();
        } else if ("miphone".equalsIgnoreCase(type)) {
            return new MiPhone();
        }
        return null;
    }
}
