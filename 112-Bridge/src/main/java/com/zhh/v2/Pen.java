package com.zhh.v2;

/**
 * @author zhh
 * @description 笔类
 * @date 2020-02-26 14:52
 */
public abstract class Pen {

    /**
     * 图形
     */
    protected Shape shape;

    public Pen(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
