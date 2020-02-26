package com.zhh.v1;

/**
 * @author zhh
 * @description 铅笔画正方形类
 * @date 2020-02-26 14:58
 */
public class SquareWithPencil extends Pencil {

    @Override
    public void draw() {
        System.out.println(getName() + "画正方形");
    }
}
