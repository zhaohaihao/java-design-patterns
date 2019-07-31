package com.zhh.srp;

import com.zhh.srp.classdemo.DairyDrink;
import com.zhh.srp.classdemo.SodaDrink;

/**
 * @author zhh
 * @description 测试类
 * @date 2019-07-31 00:40
 */
public class Test {

    public static void main(String[] args) {

        SodaDrink sodaDrink = new SodaDrink();
        sodaDrink.type("可乐");

        DairyDrink dairyDrink = new DairyDrink();
        dairyDrink.type("牛奶");
    }
}
