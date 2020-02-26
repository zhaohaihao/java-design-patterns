package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-26 15:00
 */
public class Test {

    public static void main(String[] args) {
        Pen circleWithBallPen = new CircleWithBallPen();
        circleWithBallPen.draw();

        Pen circleWithPencil = new CircleWithPencil();
        circleWithPencil.draw();

        Pen squareWithBallPen = new SquareWithBallPen();
        squareWithBallPen.draw();

        Pen squareWithPencil = new SquareWithPencil();
        squareWithPencil.draw();
    }
}
