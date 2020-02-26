package com.zhh.v1;

/**
 * @author zhh
 * @description 圆珠笔画圆类
 * @date 2020-02-26 14:57
 */
public class CircleWithBallPen extends BallPen {

    @Override
    public void draw() {
        System.out.println(getName() + "画圆");
    }
}
