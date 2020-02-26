package com.zhh.v2;

/**
 * @author zhh
 * @description 圆珠笔类
 * @date 2020-02-26 14:56
 */
public class BallPen extends Pen {

    public BallPen(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("圆珠笔" + super.shape.draw());
    }
}
