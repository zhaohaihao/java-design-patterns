package com.zhh.v1;

/**
 * @author zhh
 * @description 12306网站类(代理对象)
 * @date 2020-02-26 21:47
 */
public class Website12306 extends Station {

    public Website12306(String username, String start, String end) {
        super(username, start, end);
    }

    @Override
    public void buy() {
        // 模拟日志打印
        System.out.println(String.format("【打印日志】 %s在12306平台上购买从%s至%s的火车票", getUsername(), getStart(), getEnd()));
        super.buy();
    }
}
