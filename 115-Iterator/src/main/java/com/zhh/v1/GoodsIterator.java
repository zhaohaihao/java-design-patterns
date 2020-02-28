package com.zhh.v1;

/**
 * @author zhh
 * @description 商品抽象迭代器接口
 * @date 2020-02-28 14:28
 */
public interface GoodsIterator {

    /**
     * 获取下一个商品
     */
    Goods nextGoods();

    /**
     * 判断是否还有商品
     */
    boolean hasGoods();
}
