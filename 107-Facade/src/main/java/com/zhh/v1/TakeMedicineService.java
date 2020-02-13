package com.zhh.v1;

/**
 * @author zhh
 * @description 取药类
 * @date 2020-02-13 16:23
 */
public class TakeMedicineService {

    public void operate(Patient patient) {
        // 模拟取药
        System.out.println("病人: " + patient.getName() + " 进行取药");
    }
}
