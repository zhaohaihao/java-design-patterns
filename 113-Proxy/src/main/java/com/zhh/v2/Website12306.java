package com.zhh.v2;

/**
 * @author zhh
 * @description 12306网站类(代理对象)
 * @date 2020-02-26 21:47
 */
public class Website12306 implements Station {

    /**
     * 姓名
     */
    private String username;

    /**
     * 始发站
     */
    private String start;

    /**
     * 终点站
     */
    private String end;

    private Station station;

    public Website12306(String username, String start, String end) {
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public void buy() {
        // 模拟日志打印
        System.out.println(String.format("【打印日志】 %s在12306平台上购买从%s至%s的火车票", username, start, end));
        if (station == null) {
            station = new ZhuJiStation(username, start, end);
        }
        station.buy();
    }
}
