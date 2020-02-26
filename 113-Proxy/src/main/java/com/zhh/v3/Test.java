package com.zhh.v3;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-26 21:54
 */
public class Test {

    public static void main(String[] args) {
        Station station = (Station) new StationDynamicProxy(new ZhuJiStation("海豪", "诸暨", "杭州")).bind();
        station.buy();
    }
}
