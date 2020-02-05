package com.zhh.v4;

/**
 * @author zhh
 * @description 商品实现类
 * @date 2020-02-05 22:56
 */
public class GoodsImpl implements IGoodsManager, IGoodsInfo {

    public String getGoodsName() {
        return "商品名称";
    }

    public Double getGoodsPrice() {
        return 0.0;
    }

    public void buyGoods() {
        System.out.println("购买商品");
    }

    public void refundGoods() {
        System.out.println("退款商品");
    }
}
