package com.zhh.v1;

/**
 * @author zhh
 * @description 老板
 * @date 2020-03-03 12:52
 */
public class Boss extends IStaff {

    public Boss(WorkGroup workGroup) {
        super(workGroup, null);
        // 注册至中介者对象当中
        workGroup.addStaff(this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(String.format("老板接收到消息: %s", message));
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(String.format("老板发送消息: %s", message));
        workGroup.sendMessage(this, message);
    }
}
