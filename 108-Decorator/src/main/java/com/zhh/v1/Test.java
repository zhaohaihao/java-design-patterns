package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-14 00:21
 */
public class Test {

    public static void main(String[] args) {
        AbstractMilkyTea abstractMilkyTea = new MilkyTea();
        abstractMilkyTea = new SugarDecorator(abstractMilkyTea);
        abstractMilkyTea = new PearlDecorator(abstractMilkyTea);
        System.out.println(abstractMilkyTea.desc() + " 的销售价格是:" + abstractMilkyTea.price());

        abstractMilkyTea = new MilkyTea();
        abstractMilkyTea = new RedBeanDecorator(abstractMilkyTea);
        abstractMilkyTea = new PearlDecorator(abstractMilkyTea);
        System.out.println(abstractMilkyTea.desc() + " 的销售价格是:" + abstractMilkyTea.price());
    }
}
