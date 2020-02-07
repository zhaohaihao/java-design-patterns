package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-07 11:09
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Staff staff = new Staff();

        boss.requireCheckNumber(staff);
    }
}
