package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-02 16:48
 */
public class Test {

    public static void main(String[] args) {
        Staff staff = new Staff("亚萍");
        Command sendTweetsCommand = new SendTweetsCommand(staff);
        Command lookVenueCommand = new LookVenueCommand(staff);
        Command attendMeetingCommand = new AttendMeetingCommand(staff);

        Boss boss = new Boss();
        boss.addCommand(sendTweetsCommand);
        boss.addCommand(lookVenueCommand);
        boss.addCommand(attendMeetingCommand);

        boss.sendCommands();
    }
}
