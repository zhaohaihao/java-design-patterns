package com.zhh.v1;

/**
 * @author zhh
 * @description 抽象模板类
 * @date 2020-02-27 15:47
 */
public abstract class AbstractCook {

    /**
     * 做饭的整体步骤
     */
    protected final void cook() {
        this.pourOil();
        this.addEgg();
        this.addTomato();
        this.pourSeasoning();
        this.stirFry();
        if (needChoppedGreenOnion()) {
            this.addChoppedGreenOnion();
        }
    }

    /**
     * 倒油
     */
    final void pourOil() {
        System.out.println("倒入食用油");
    }

    /**
     * 放鸡蛋
     */
    final void addEgg() {
        System.out.println("放入鸡蛋");
    }

    /**
     * 放番茄
     */
    final void addTomato() {
        System.out.println("放入番茄");
    }

    /**
     * 翻炒
     */
    final void stirFry() {
        System.out.println("快速翻炒");
    }

    /**
     * 放葱花
     */
    final void addChoppedGreenOnion() {
        System.out.println("放点葱花");
    }

    /**
     * 是否需要葱花 (钩子方法)
     */
    protected boolean needChoppedGreenOnion() {
        return false;
    }

    /**
     * 倒调味品
     */
    abstract void pourSeasoning();
}
