package com.zhh.v1;

/**
 * @author zhh
 * @description 珍珠装饰者
 * @date 2020-02-13 23:56
 */
public class PearlDecorator extends AbstractDecorator {

    public PearlDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加珍珠";
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }
}
