package com.zhh.v1;

/**
 * @author zhh
 * @description 苹果电子产品工厂类
 * @date 2020-02-11 01:00
 */
public class IElectronicProductFactory implements ElectronicProductFactory {

    public Phone getPhone() {
        return new IPhone();
    }

    public Computer getComputer() {
        return new IComputer();
    }
}
