package com.zhh.ocp.goods;

/**
 * @author zhh
 * @description 商品接口
 * @date 2019-07-23 23:46
 */
public interface IGoods {

    /**
     * 获取商品ID
     */
    Integer getId();

    /**
     * 获取商品名称
     */
    String getName();

    /**
     * 获取商品价格
     */
    Double getPrice();
}
