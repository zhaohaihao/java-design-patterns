package com.zhh.v1;

import java.util.List;

/**
 * @author zhh
 * @description 商品抽象迭代器类
 * @date 2020-02-28 14:32
 */
public class GoodsIteratorImpl implements GoodsIterator {

    private List<Goods> goodsList;

    /**
     * 商品位置
     */
    private int index;

    public GoodsIteratorImpl(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public Goods nextGoods() {
        System.out.println("当前商品的位置是" + index);
        Goods goods = goodsList.get(index);
        index++;
        return goods;
    }

    public boolean hasGoods() {
        if (index < goodsList.size()) {
            return true;
        }
        return false;
    }
}
