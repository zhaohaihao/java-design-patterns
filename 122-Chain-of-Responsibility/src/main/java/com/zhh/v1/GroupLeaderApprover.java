package com.zhh.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhh
 * @description 组长
 * @date 2020-03-03 15:07
 */
public class GroupLeaderApprover extends Approver {

    @Override
    public void approve(PersonalLeaveRequest request) {
        if (StringUtils.isNotEmpty(request.getReason())) {
            System.out.println("组长审核结果: 批准");
            if (approver != null) {
                approver.approve(request);
            }
        } else {
            System.out.println("组长审核结果: 不批准");
        }
    }
}
