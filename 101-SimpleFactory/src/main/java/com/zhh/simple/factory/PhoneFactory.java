package com.zhh.simple.factory;

/**
 * @author zhh
 * @description 手机工厂类
 * @date 2019-10-12 00:29
 */
public class PhoneFactory {

    // /**
    //  * 获取手机
    //  * @param type 手机类型
    //  * @return
    //  */
    // public static Phone getPhone(String type) {
    //     if ("iphone".equalsIgnoreCase(type)) {
    //         return new IPhone();
    //     } else if ("miphone".equalsIgnoreCase(type)) {
    //         return new MiPhone();
    //     }
    //     return null;
    // }

    /**
     * 获取手机(方案改进, 利用反射)
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
