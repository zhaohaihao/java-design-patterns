package com.zhh.v1;

/**
 * @author zhh
 * @description 审批人
 * @date 2020-03-03 14:58
 */
public abstract class Approver {

    /**
     * 后继审批人
     */
    protected Approver approver;

    /**
     * 设置后继审批人
     * @param approver 后继审批人
     */
    public void setNextApprpver(Approver approver) {
        this.approver = approver;
    }

    /**
     * 审批
     * @param request 事假请求
     */
    public abstract void approve(PersonalLeaveRequest request);
}
