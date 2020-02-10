package com.zhh.v2;

/**
 * @author zhh
 * @description 手机工厂类
 * @date 2020-02-10 11:09
 */
public class PhoneFactory {

    /**
     * 获取手机(方案改进，利用反射)
     * @param clazz 类对象
     * @return
     */
    public static Phone getPhone(Class clazz) {
        try {
            return (Phone) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
