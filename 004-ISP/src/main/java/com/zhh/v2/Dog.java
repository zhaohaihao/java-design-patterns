package com.zhh.v2;

/**
 * @author zhh
 * @description 狗
 * @date 2020-02-06 00:51
 */
public class Dog implements IEat, IMakeSound {

    public void eat() {
        System.out.println("狗可以吃");
    }

    public void makeSound() {
        System.out.println("狗可以发出声音");
    }
}
