package com.zhh.v1;

/**
 * @author zhh
 * @description 狗
 * @date 2020-02-06 00:51
 */
public class Dog implements IAnimal {

    public void eat() {
        System.out.println("狗可以吃");
    }

    public void fly() {
        // 狗不能飞
    }

    public void makeSound() {
        System.out.println("狗可以发出声音");
    }
}
