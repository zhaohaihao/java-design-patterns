package com.zhh.v2;

/**
 * @author zhh
 * @description 接待员类
 * @date 2020-02-13 16:46
 */
public class Receptionist {

    // 模拟注入
    private RegisterService registerService = new RegisterService();
    private OutpatientService outpatientService = new OutpatientService();
    private SettleAccountService settleAccountService = new SettleAccountService();
    private TakeMedicineService takeMedicineService = new TakeMedicineService();


    /**
     * 接待病人
     * @param patient
     */
    public void receivePatients(Patient patient) {
        System.out.println("接待员开始接待病人");
        registerService.operate(patient);
        outpatientService.operate(patient);
        settleAccountService.operate(patient);
        takeMedicineService.operate(patient);
    }
}
