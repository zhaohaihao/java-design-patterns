package com.zhh.v1;

/**
 * @author zhh
 * @description 商品抽象聚合接口
 * @date 2020-02-28 14:26
 */
public interface GoodsAggregate {

    /**
     * 添加商品
     */
    void addGoods(Goods goods);

    /**
     * 删除商品
     */
    void removeGoods(Goods goods);

    /**
     * 获取商品迭代器
     */
    GoodsIterator getGoodsIterator();
}
