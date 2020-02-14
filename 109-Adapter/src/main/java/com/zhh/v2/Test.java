package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-14 16:59
 */
public class Test {

    public static void main(String[] args) {
        TypeCInterface typeCInterface = new TypeCInterface();
        SDInterface sdInterface = new TypeCDockStation(typeCInterface);
        sdInterface.sdRead();
    }
}
