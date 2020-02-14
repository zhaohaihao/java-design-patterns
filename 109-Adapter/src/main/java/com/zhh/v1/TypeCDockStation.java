package com.zhh.v1;

/**
 * @author zhh
 * @description Type-C扩展坞
 * @date 2020-02-14 16:43
 */
public class TypeCDockStation extends TypeCInterface implements SDInterface {

    public void sdRead() {
        System.out.println("SD卡接口读取...");
        System.out.println("扩展坞转换");
        super.typeCRead();
    }
}
