package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-28 14:40
 */
public class Test {

    public static void main(String[] args) {
        // 创建商品
        Goods goods1 = new Goods("可乐", 3.0);
        Goods goods2 = new Goods("薯片", 5.0);
        Goods goods3 = new Goods("奶茶", 3.0);
        Goods goods4 = new Goods("香肠", 10.0);
        Goods goods5 = new Goods("奶粉", 33.0);
        Goods goods6 = new Goods("牛肉干", 23.0);

        GoodsAggregate goodsAggregate = new GoodsAggregateImpl();
        goodsAggregate.addGoods(goods1);
        goodsAggregate.addGoods(goods2);
        goodsAggregate.addGoods(goods3);
        goodsAggregate.addGoods(goods4);
        goodsAggregate.addGoods(goods5);
        goodsAggregate.addGoods(goods6);

        System.out.println("---商品清单---");
        GoodsIterator goodsIterator = goodsAggregate.getGoodsIterator();
        Goods goods;
        while (goodsIterator.hasGoods()) {
            goods = goodsIterator.nextGoods();
            System.out.println(String.format("商品名称: %s, 商品价格: %s", goods.getName(), goods.getPrice()));
        }
    }
}
