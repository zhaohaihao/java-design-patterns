package com.zhh.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhh
 * @description 微信工作群
 * @date 2020-03-03 12:29
 */
public class WeChatWorkGroup implements WorkGroup {

    private List<IStaff> staffList = new ArrayList<IStaff>();

    public void addStaff(IStaff staff) {
        if (staff != null && !staffList.contains(staff)) {
            staffList.add(staff);
        }
    }

    public void sendMessage(IStaff staff, String message) {
        for (IStaff iStaff : staffList) {
            // 排除自身, 给别的员工发消息
            if (!staff.equals(iStaff)) {
                iStaff.receiveMessage(message);
            }
        }
    }
}
