package com.zhh.v1;

/**
 * @author zhh
 * @description 糖装饰者
 * @date 2020-02-13 23:58
 */
public class SugarDecorator extends AbstractDecorator {

    public SugarDecorator(AbstractMilkyTea abstractMilkyTea) {
        super(abstractMilkyTea);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加糖";
    }

    @Override
    protected int price() {
        return super.price() + 1;
    }
}
