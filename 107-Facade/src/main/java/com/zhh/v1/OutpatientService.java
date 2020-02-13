package com.zhh.v1;

/**
 * @author zhh
 * @description 门诊类
 * @date 2020-02-13 16:18
 */
public class OutpatientService {

    public void operate(Patient patient) {
        // 模拟就诊
        System.out.println("病人: " + patient.getName() + " 进行就诊");
        System.out.println("就诊完毕, 需要配药");
    }
}
