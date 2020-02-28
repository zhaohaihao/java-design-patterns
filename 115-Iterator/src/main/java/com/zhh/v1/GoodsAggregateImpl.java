package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 商品具体聚合类
 * @date 2020-02-28 14:30
 */
public class GoodsAggregateImpl implements GoodsAggregate {

    private List<Goods> goodsList = new ArrayList<Goods>();

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public void removeGoods(Goods goods) {
        goodsList.remove(goods);
    }

    public GoodsIterator getGoodsIterator() {
        return new GoodsIteratorImpl(goodsList);
    }
}
