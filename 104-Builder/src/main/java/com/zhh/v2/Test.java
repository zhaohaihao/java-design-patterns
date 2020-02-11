package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-11 15:05
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buyCpu("Intel 酷睿i7 8700K")
                .buyMainboard("影驰B360M-M.2")
                .buyMemory("影驰GAMER 8GB DDR4 2400")
                .buyHardDisk("希捷Barracuda 1TB 7200转 64MB")
                .buyGpu("七彩虹iGame750Ti 烈焰战神U-Twin-2GD5")
                .buyCrate("金河田峥嵘Z30")
                .buyPowerSupply("航嘉WD600K")
                .buyMonitor("三星C27F390FHC")
                .build();

        System.out.println(computer);
    }
}
