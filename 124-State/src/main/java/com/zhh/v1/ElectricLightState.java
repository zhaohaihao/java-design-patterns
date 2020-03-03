package com.zhh.v1;

/**
 * @author zhh
 * @description 电灯状态类(抽象状态类)
 * @date 2020-03-03 22:38
 */
public abstract class ElectricLightState {

    protected ElectricLightContext electricLightContext;

    public void setElectricLightContext(ElectricLightContext electricLightContext) {
        this.electricLightContext = electricLightContext;
    }

    /**
     * 开灯
     */
    public abstract void turnOn();

    /**
     * 关灯
     */
    public abstract void turnOff();

    /**
     * 获取状态
     */
    public abstract String getState();
}
