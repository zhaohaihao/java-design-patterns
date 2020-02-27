package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-27 16:13
 */
public class Test {

    public static void main(String[] args) {
        // 我做番茄炒蛋
        System.out.println("---我做番茄炒蛋 开始---");
        AbstractCook meCook = new MeCook();
        meCook.cook();
        System.out.println("---我做番茄炒蛋 结束---");

        // 女朋友做番茄炒蛋
        System.out.println("---女朋友做番茄炒蛋 开始---");
        AbstractCook girlFriendCook = new GirlFriendCook();
        girlFriendCook.cook();
        System.out.println("---女朋友做番茄炒蛋 结束---");
    }
}
