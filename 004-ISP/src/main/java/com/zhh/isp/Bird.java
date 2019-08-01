package com.zhh.isp;

/**
 * @author zhh
 * @description
 * @date 2019-08-01 23:32
 */
public class Bird implements IEat, IFly, IMakeSound {

    public void eat() {
        System.out.println("鸟可以吃");
    }

    public void fly() {
        System.out.println("鸟可以飞");
    }

    public void makeSound() {
        System.out.println("鸟可以发出声音");
    }
}
