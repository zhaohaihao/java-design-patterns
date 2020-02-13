package com.zhh.v1;

/**
 * @author zhh
 * @description 挂号类
 * @date 2020-02-13 16:15
 */
public class RegisterService {

    public void operate(Patient patient) {
        // 模拟挂号
        System.out.println("病人: " + patient.getName() + " 进行挂号");
        System.out.println("挂号完毕");
    }
}
