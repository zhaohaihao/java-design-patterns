package com.zhh.v1;

/**
 * @author zhh
 * @description 关闭状态
 * @date 2020-03-03 22:43
 */
public class TurnOffState extends ElectricLightState {

    @Override
    public void turnOn() {
        super.electricLightContext.setElectricLightState(ElectricLightContext.TURN_ON_STATE);
    }

    @Override
    public void turnOff() {
        System.out.println("操作错误, 当前电灯状态已经是关闭状态");
    }

    @Override
    public String getState() {
        return "关闭状态";
    }
}
