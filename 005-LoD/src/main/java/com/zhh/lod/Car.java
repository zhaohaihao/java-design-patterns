package com.zhh.lod;

/**
 * @author zhh
 * @description 汽车类
 * @date 2019-08-13 23:44
 */
public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(Key key) {
        Doors doors = new Doors();
        doors.lock();

        boolean turns = key.turns();

        if (turns) {
            engine.start();
            updateDashboard();
        }
    }

    /**
     * 更新面板
     */
    public void updateDashboard() {
        System.out.println("更新面板");
    }
}
