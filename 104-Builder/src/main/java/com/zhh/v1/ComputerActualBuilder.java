package com.zhh.v1;

/**
 * @author zhh
 * @description 实际的电脑建造者类
 * @date 2020-02-11 14:41
 */
public class ComputerActualBuilder extends ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buyCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buyMainboard(String mainboard) {
        computer.setMainboard(mainboard);
    }

    @Override
    public void buyMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public void buyHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public void buyGpu(String gpu) {
        computer.setGpu(gpu);
    }

    @Override
    public void buyCrate(String crate) {
        computer.setCrate(crate);
    }

    @Override
    public void buyPowerSupply(String powerSupply) {
        computer.setPowerSupply(powerSupply);
    }

    @Override
    public void buyMonitor(String monitor) {
        computer.setMonitor(monitor);
    }

    @Override
    public Computer assembleComputer() {
        return computer;
    }
}
