package com.zhh.v2;

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

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.mainboard = computerBuilder.mainboard;
        this.memory = computerBuilder.memory;
        this.hardDisk = computerBuilder.hardDisk;
        this.gpu = computerBuilder.gpu;
        this.crate = computerBuilder.crate;
        this.powerSupply = computerBuilder.powerSupply;
        this.monitor = computerBuilder.monitor;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu='" + cpu + '\'' + ", mainboard='" + mainboard + '\'' + ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' + ", gpu='" + gpu + '\'' + ", crate='" + crate + '\'' +
                ", powerSupply='" + powerSupply + '\'' + ", monitor='" + monitor + '\'' + '}';
    }

    /**
     * 声明静态内部类
     */
    public static class ComputerBuilder {
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

        public ComputerBuilder buyCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder buyMainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder buyMemory(String memory){
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buyHardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }

        public ComputerBuilder buyGpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder buyCrate(String crate){
            this.crate = crate;
            return this;
        }

        public ComputerBuilder buyPowerSupply(String powerSupply){
            this.powerSupply = powerSupply;
            return this;
        }

        public ComputerBuilder buyMonitor(String monitor){
            this.monitor = monitor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
