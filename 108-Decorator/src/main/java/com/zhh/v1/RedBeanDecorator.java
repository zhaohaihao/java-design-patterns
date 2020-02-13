package com.zhh.v1;

/**
 * @author zhh
 * @description 红豆装饰者
 * @date 2020-02-14 00:14
 */
public class RedBeanDecorator extends AbstractDecorator {

    public RedBeanDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加红豆";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
