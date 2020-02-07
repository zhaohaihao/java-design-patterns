package com.zhh.v1;

import java.util.List;

/**
 * @author zhh
 * @description 职工类
 * @date 2020-02-07 11:02
 */
public class Staff {

    /**
     * 职工查询商品数量
     * @param goods 商品列表
     */
    public void checkNumber(List<Goods> goods) {
        System.out.println("目前超市内商品总数为: " + goods.size());
    }
}
