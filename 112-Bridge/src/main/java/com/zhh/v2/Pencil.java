package com.zhh.v2;

/**
 * @author zhh
 * @description 铅笔类
 * @date 2020-02-26 14:55
 */
public class Pencil extends Pen {

    public Pencil(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("铅笔" + super.shape.draw());
    }
}
