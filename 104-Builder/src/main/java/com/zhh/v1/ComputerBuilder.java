package com.zhh.v1;

/**
 * @author zhh
 * @description 抽象电脑建造者类
 * @date 2020-02-11 14:32
 */
public abstract class ComputerBuilder {

    public abstract void buyCpu(String cpu);
    public abstract void buyMainboard(String mainboard);
    public abstract void buyMemory(String memory);
    public abstract void buyHardDisk(String hardDisk);
    public abstract void buyGpu(String gpu);
    public abstract void buyCrate(String crate);
    public abstract void buyPowerSupply(String powerSupply);
    public abstract void buyMonitor(String monitor);

    /**
     * 组装电脑
     */
    public abstract Computer assembleComputer();
}
