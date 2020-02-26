package com.zhh.v1;

/**
 * @author zhh
 * @description 圆珠笔画正方形类
 * @date 2020-02-26 14:59
 */
public class SquareWithBallPen extends BallPen {

    @Override
    public void draw() {
        System.out.println(getName() + "画正方形");
    }
}
