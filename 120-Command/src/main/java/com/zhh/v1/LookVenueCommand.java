package com.zhh.v1;

/**
 * @author zhh
 * @description 看场地命令
 * @date 2020-03-02 16:37
 */
public class LookVenueCommand implements Command {

    private Staff staff;

    public LookVenueCommand(Staff staff) {
        this.staff = staff;
    }

    public void execute() {
        staff.lookVenue();
    }
}
