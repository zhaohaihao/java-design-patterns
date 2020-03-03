package com.zhh.v1;

/**
 * @author zhh
 * @description 工作群类
 * @date 2020-03-03 12:12
 */
public interface WorkGroup {

    /**
     * 添加员工
     * @param staff 员工
     */
    void addStaff(IStaff staff);

    /**
     * 发送消息
     * @param staff 发送消息的员工
     * @param message 消息
     */
    void sendMessage(IStaff staff, String message);
}
