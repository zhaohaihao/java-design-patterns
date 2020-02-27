package com.zhh.v1;

/**
 * @author zhh
 * @description 具体子类
 * @date 2020-02-27 16:04
 */
public class MeCook extends AbstractCook {

    @Override
    void pourSeasoning() {
        System.out.println("放点盐");
        System.out.println("放点酱油");
    }

    /**
     * 此处覆盖了父类钩子方法的默认实现
     */
    @Override
    protected boolean needChoppedGreenOnion() {
        return true;
    }
}
