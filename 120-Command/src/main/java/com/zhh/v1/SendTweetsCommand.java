package com.zhh.v1;

/**
 * @author zhh
 * @description 发送推文命令
 * @date 2020-03-02 16:33
 */
public class SendTweetsCommand implements Command {

    private Staff staff;

    public SendTweetsCommand(Staff staff) {
        this.staff = staff;
    }

    public void execute() {
        staff.sendTweets();
    }
}
