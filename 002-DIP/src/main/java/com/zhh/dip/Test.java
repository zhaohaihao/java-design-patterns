package com.zhh.dip;

import com.zhh.dip.goods.impl.Coke;
import com.zhh.dip.goods.impl.Crisps;
import com.zhh.dip.person.Hilox;

/**
 * @author zhh
 * @description 测试类
 * @date 2019-07-29 16:41
 */
public class Test {

    public static void main(String[] args) {
        Hilox hilox = new Hilox();
        hilox.buyGood(new Coke());
        hilox.buyGood(new Crisps());
    }
}
