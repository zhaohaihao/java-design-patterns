package com.zhh.v2;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-13 16:24
 */
public class Test {

    public static void main(String[] args) {
        Patient patient = new Patient("海豪");
        Receptionist receptionist = new Receptionist();

        System.out.println("病人进入医院");
        receptionist.receivePatients(patient);
        System.out.println("病人离开医院");
    }
}
