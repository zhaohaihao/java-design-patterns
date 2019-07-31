package com.zhh.srp.methoddemo;

/**
 * @author zhh
 * @description
 * @date 2019-07-31 01:43
 */
public class Method {

    /**
     * 更新商品信息
     * @param goodsName  商品名称
     * @param goodsPrice 商品价格
     */
    public void updateGoodsInfo(String goodsName, Double goodsPrice) {
        // 模拟更新商品名称、价格
        goodsName = "可乐";
        goodsPrice = 3.0;
    }

    public void updateGoodsName(String goodsName) {
        // 模拟更新商品名称
        goodsName = "可乐";
    }

    public void updateGoodsPrice(Double goodsPrice) {
        // 模拟更新商品价格
        goodsPrice = 3.0;
    }
}
