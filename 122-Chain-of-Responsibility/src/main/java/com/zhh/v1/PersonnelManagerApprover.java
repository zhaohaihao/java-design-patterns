package com.zhh.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zhh
 * @description 人事经理
 * @date 2020-03-03 15:07
 */
public class PersonnelManagerApprover extends Approver {

    @Override
    public void approve(PersonalLeaveRequest request) {
        if (StringUtils.isNotEmpty(request.getReason())) {
            System.out.println("人事经理审核结果: 批准");
            if (approver != null) {
                approver.approve(request);
            }
        } else {
            System.out.println("人事经理审核结果: 不批准");
        }
    }
}
