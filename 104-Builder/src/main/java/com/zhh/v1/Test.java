package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-11 15:05
 */
public class Test {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerActualBuilder();
        Enterprise enterprise = new Enterprise();
        enterprise.setComputerBuilder(computerBuilder);
        Computer computer = enterprise.assembleComputer("Intel 酷睿i7 8700K",
                "影驰B360M-M.2",
                "影驰GAMER 8GB DDR4 2400",
                "希捷Barracuda 1TB 7200转 64MB",
                "七彩虹iGame750Ti 烈焰战神U-Twin-2GD5",
                "金河田峥嵘Z30",
                "航嘉WD600K",
                "三星C27F390FHC");

        System.out.println(computer);
    }
}
