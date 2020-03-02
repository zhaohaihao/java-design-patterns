package com.zhh.v1;

/**
 * @author zhh
 * @description 安排会议命令
 * @date 2020-03-02 16:38
 */
public class AttendMeetingCommand implements Command {

    private Staff staff;

    public AttendMeetingCommand(Staff staff) {
        this.staff = staff;
    }

    public void execute() {
        staff.attendMeeting();
    }
}
