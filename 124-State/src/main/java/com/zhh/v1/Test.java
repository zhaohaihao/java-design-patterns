package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-03 22:55
 */
public class Test {

    public static void main(String[] args) {
        ElectricLightContext electricLightContext = new ElectricLightContext();
        electricLightContext.setElectricLightState(new TurnOnState());
        System.out.println(String.format("当前电灯的状态: [%s]", electricLightContext.getElectricLightState().getState()));
        electricLightContext.turnOn();

        electricLightContext.turnOff();
        System.out.println(String.format("当前电灯的状态: [%s]", electricLightContext.getElectricLightState().getState()));
    }
}
