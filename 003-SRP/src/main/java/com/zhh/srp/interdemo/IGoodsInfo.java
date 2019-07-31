package com.zhh.srp.interdemo;

/**
 * @author zhh
 * @description 商品信息接口
 * @date 2019-07-31 01:36
 */
public interface IGoodsInfo {
    /**
     * 获取商品名称
     */
    String getGoodsName();

    /**
     * 获取商品价格
     */
    Double getGoodsPrice();
}
