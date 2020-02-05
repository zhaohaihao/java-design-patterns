package com.zhh.v4;

/**
 * @author zhh
 * @description 商品信息接口
 * @date 2020-02-05 22:52
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
