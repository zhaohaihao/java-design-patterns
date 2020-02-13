package com.zhh.v1;

/**
 * @author zhh
 * @description 具体奶茶类
 * @date 2020-02-13 23:35
 */
public class MilkyTea extends AbstractMilkyTea {

    @Override
    protected String desc() {
        return "奶茶";
    }

    @Override
    protected int price() {
        return 7;
    }
}
