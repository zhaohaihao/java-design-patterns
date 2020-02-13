package com.zhh.v1;

/**
 * @author zhh
 * @description 划价类
 * @date 2020-02-13 16:19
 */
public class SettleAccountService {

    public void operate(Patient patient) {
        // 模拟付款
        System.out.println("病人: " + patient.getName() + " 进行付款");
        System.out.println("付款完成, 前往取药");
    }
}
