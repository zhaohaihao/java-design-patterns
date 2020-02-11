package com.zhh.v1;

/**
 * @author zhh
 * @description 商家类
 * @date 2020-02-11 14:55
 */
public class Enterprise {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    /**
     * 组装电脑
     */
    public Computer assembleComputer(String cpu, String mainboard,
                                     String memory, String hardDisk,
                                     String gpu, String crate,
                                     String powerSupply, String monitor) {
        computerBuilder.buyCpu(cpu);
        computerBuilder.buyMainboard(mainboard);
        computerBuilder.buyMemory(memory);
        computerBuilder.buyHardDisk(hardDisk);
        computerBuilder.buyGpu(gpu);
        computerBuilder.buyCrate(crate);
        computerBuilder.buyPowerSupply(powerSupply);
        computerBuilder.buyMonitor(monitor);

        return computerBuilder.assembleComputer();
    }
}
