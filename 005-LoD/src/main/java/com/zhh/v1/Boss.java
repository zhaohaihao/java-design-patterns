package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 老板类
 * @date 2020-02-07 10:59
 */
public class Boss {

    /**
     * 老板要求职工查商品的数量
     * @param staff 职工
     */
    public void requireCheckNumber(Staff staff) {
        List<Goods> goodsList = new ArrayList<Goods>();

        // 这里模拟从数据库查商品数量
        for (int i = 0; i < 50; i++) {
            goodsList.add(new Goods());
        }

        staff.checkNumber(goodsList);
    }
}
