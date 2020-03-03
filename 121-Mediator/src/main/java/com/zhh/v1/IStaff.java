package com.zhh.v1;

/**
 * @author zhh
 * @description 员工类
 * @date 2020-03-03 12:26
 */
public abstract class IStaff {

    protected WorkGroup workGroup;

    /**
     * 姓名
     */
    protected String name;

    public IStaff(WorkGroup workGroup, String name) {
        this.workGroup = workGroup;
        this.name = name;
    }

    /**
     * 接收消息
     * @param message 消息
     */
    public abstract void receiveMessage(String message);

    /**
     * 发送消息
     * @param message 消息
     */
    public abstract void sendMessage(String message);
}
