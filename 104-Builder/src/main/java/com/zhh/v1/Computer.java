package com.zhh.v1;

/**
 * @author zhh
 * @description 电脑类
 * @date 2020-02-11 14:01
 */
public class Computer {

    /**
     * cpu
     */
    private String cpu;

    /**
     * 主板
     */
    private String mainboard;

    /**
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String hardDisk;

    /**
     * 显卡
     */
    private String gpu;

    /**
     * 机箱
     */
    private String crate;

    /**
     * 电源
     */
    private String powerSupply;

    /**
     * 显示器
     */
    private String monitor;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCrate() {
        return crate;
    }

    public void setCrate(String crate) {
        this.crate = crate;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu='" + cpu + '\'' + ", mainboard='" + mainboard + '\'' + ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' + ", gpu='" + gpu + '\'' + ", crate='" + crate + '\'' +
                ", powerSupply='" + powerSupply + '\'' + ", monitor='" + monitor + '\'' + '}';
    }
}
