package com.zhh.v1;

/**
 * @author zhh
 * @description 普通员工
 * @date 2020-03-03 12:48
 */
public class Staff extends IStaff {

    public Staff(WorkGroup workGroup, String name) {
        super(workGroup, name);
        // 注册至中介者对象当中
        workGroup.addStaff(this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(String.format("员工[%s]接收到消息: %s", this.name, message));
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("员工[%s]发送消息: %s", this.name, message));
        workGroup.sendMessage(this, message);
    }
}
