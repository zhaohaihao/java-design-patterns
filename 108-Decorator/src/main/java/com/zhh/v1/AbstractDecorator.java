package com.zhh.v1;

/**
 * @author zhh
 * @description 抽象装饰者类
 * @date 2020-02-13 23:37
 */
public abstract class AbstractDecorator extends AbstractMilkyTea {

    private AbstractMilkyTea abstractMilkyTea;

    public AbstractDecorator(AbstractMilkyTea abstractMilkyTea) {
        this.abstractMilkyTea = abstractMilkyTea;
    }

    @Override
    protected String desc() {
        return this.abstractMilkyTea.desc();
    }

    @Override
    protected int price() {
        return this.abstractMilkyTea.price();
    }
}
