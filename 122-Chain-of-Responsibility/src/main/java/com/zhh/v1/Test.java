package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-03-03 15:23
 */
public class Test {

    public static void main(String[] args) {
        PersonalLeaveRequest request = new PersonalLeaveRequest();
        request.setApplicant("海豪");
        request.setDays(6);
        request.setStartTime("2020年03月03日15:24:37");
        request.setReason("家中有事");

        Approver groupLeaderApprover = new GroupLeaderApprover();
        Approver personnelManagerApprover = new PersonnelManagerApprover();
        Approver inspectorGeneralApprover = new InspectorGeneralApprover();
        Approver bossApprover = new BossApprover();

        Integer days = request.getDays();
        // 审批事假规则
        if (PersonalLeaveRequest.Days.ONE.equals(days)) {
            // 事假天数1天
            groupLeaderApprover.setNextApprpver(personnelManagerApprover);
        } else if (days > PersonalLeaveRequest.Days.ONE && days <= PersonalLeaveRequest.Days.SEVEN) {
            // 事假天数1天-7天(包含7天)
            groupLeaderApprover.setNextApprpver(inspectorGeneralApprover);
            inspectorGeneralApprover.setNextApprpver(personnelManagerApprover);
        } else if (days > PersonalLeaveRequest.Days.SEVEN) {
            // 事假天数7天以上
            groupLeaderApprover.setNextApprpver(inspectorGeneralApprover);
            groupLeaderApprover.setNextApprpver(bossApprover);
            bossApprover.setNextApprpver(personnelManagerApprover);
        } else {
            throw new RuntimeException("请假天数异常");
        }

        System.out.println(">>>>");
        System.out.println(
                String.format("[%s]发起请假申请, 请假天数[%s]天, 请假开始时间[%s], 请假理由[%s]", request.getApplicant(), request.getDays(),
                        request.getStartTime(), request.getReason()));
        System.out.println("<<<<");

        System.out.println("审核结果如下:");
        groupLeaderApprover.approve(request);
    }
}
