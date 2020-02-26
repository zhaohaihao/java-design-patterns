package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-26 15:00
 */
public class Test {

    public static void main(String[] args) {
        Pen ballPen1 = new BallPen(new Circle());
        ballPen1.draw();

        Pen ballPen2 = new BallPen(new Square());
        ballPen2.draw();

        Pencil pencil1 = new Pencil(new Circle());
        pencil1.draw();

        Pencil pencil2 = new Pencil(new Square());
        pencil2.draw();
    }
}
