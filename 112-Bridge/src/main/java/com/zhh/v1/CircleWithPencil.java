package com.zhh.v1;

/**
 * @author zhh
 * @description 铅笔画圆类
 * @date 2020-02-26 14:56
 */
public class CircleWithPencil extends Pencil {

    @Override
    public void draw() {
        System.out.println(getName() + "画圆");
    }
}
