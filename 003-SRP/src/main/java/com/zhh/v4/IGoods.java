package com.zhh.v4;

/**
 * @author zhh
 * @description 商品接口
 * @date 2020-02-05 22:49
 */
public interface IGoods {

    /**
     * 获取商品名称
     */
    String getGoodsName();

    /**
     * 获取商品价格
     */
    Double getGoodsPrice();

    /**
     * 购买商品
     */
    void buyGoods();

    /**
     * 退款商品
     */
    void refundGoods();
}
