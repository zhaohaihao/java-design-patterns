package com.zhh.isp;

/**
 * @author zhh
 * @description
 * @date 2019-08-01 23:31
 */
public class Dog implements IEat, IMakeSound {

    public void eat() {
        System.out.println("狗可以吃");
    }

    public void makeSound() {
        System.out.println("狗可以发出声音");
    }
}
