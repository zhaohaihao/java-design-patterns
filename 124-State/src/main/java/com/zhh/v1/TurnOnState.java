package com.zhh.v1;

/**
 * @author zhh
 * @description 打开状态
 * @date 2020-03-03 22:42
 */
public class TurnOnState extends ElectricLightState {

    @Override
    public void turnOn() {
        System.out.println("操作错误, 当前电灯状态已经是打开状态");
    }

    @Override
    public void turnOff() {
        super.electricLightContext.setElectricLightState(ElectricLightContext.TURN_OFF_STATE);
    }

    @Override
    public String getState() {
        return "打开状态";
    }
}
