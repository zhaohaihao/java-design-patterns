package com.zhh.openclose.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-04 23:57
 */
public class Test {

    public static void main(String[] args) {
        IGoods iGoods = new Food(1, "巧克力", 9.9);

        String msg = String.format("商品ID: %s, 商品名称: %s, 商品价格: %s",
                iGoods.getId(), iGoods.getName(), iGoods.getPrice());

        System.out.println(msg);
    }
}
