package com.zhh.v1;

/**
 * @author zhh
 * @description 测试类
 * @date 2020-02-13 16:24
 */
public class Test {

    public static void main(String[] args) {
        Patient patient = new Patient("海豪");
        System.out.println("病人进入医院");
        new RegisterService().operate(patient);
        new OutpatientService().operate(patient);
        new SettleAccountService().operate(patient);
        new TakeMedicineService().operate(patient);
        System.out.println("病人离开医院");
    }
}
