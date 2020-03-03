package com.zhh.v1;

/**
 * @author zhh
 * @description 电灯环境类(环境类)
 * @date 2020-03-03 22:39
 */
public class ElectricLightContext {

    private ElectricLightState electricLightState;

    public final static TurnOnState TURN_ON_STATE = new TurnOnState();

    public final static TurnOffState TURN_OFF_STATE = new TurnOffState();

    public ElectricLightState getElectricLightState() {
        return electricLightState;
    }

    public void setElectricLightState(ElectricLightState electricLightState) {
        this.electricLightState = electricLightState;
        // 将当前的环境通知到各个状态实现类
        this.electricLightState.setElectricLightContext(this);
    }

    public void turnOn() {
        this.electricLightState.turnOn();
    }

    public void turnOff() {
        this.electricLightState.turnOff();
    }
}
