package com.zhh.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 职工类
 * @date 2020-02-07 11:02
 */
public class Staff {

    /**
     * 职工查询商品数量
     */
    public void checkNumber() {
        List<Goods> goodsList = new ArrayList<Goods>();

        // 这里模拟从数据库查商品数量
        for (int i = 0; i < 50; i++) {
            goodsList.add(new Goods());
        }
        System.out.println("目前超市内商品总数为: " + goodsList.size());
    }
}
