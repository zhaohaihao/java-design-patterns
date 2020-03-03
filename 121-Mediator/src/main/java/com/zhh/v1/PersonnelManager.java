package com.zhh.v1;

/**
 * @author zhh
 * @description 人事经理
 * @date 2020-03-03 12:49
 */
public class PersonnelManager extends IStaff {

    public PersonnelManager(WorkGroup workGroup) {
        super(workGroup, null);
        // 注册至中介者对象当中
        workGroup.addStaff(this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(String.format("人事经理接收到消息: %s", message));
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("人事经理发送消息: %s", message));
        workGroup.sendMessage(this, message);
    }
}
