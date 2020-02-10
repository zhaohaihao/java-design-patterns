package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-11 01:19
 */
public class Test {

    public static void main(String[] args) {
        ElectronicProductFactory factory = new IElectronicProductFactory();
        Computer computer = factory.getComputer();
        computer.produce();
    }
}
