package com.zhh.v2;

/**
 * @author zhh
 * @description
 * @date 2020-02-14 17:23
 */
public class TypeCDockStation implements SDInterface {

    private TypeCInterface typeCInterface;

    public TypeCDockStation(TypeCInterface typeCInterface) {
        this.typeCInterface = typeCInterface;
    }

    public void sdRead() {
        System.out.println("SD卡接口读取...");
        System.out.println("扩展坞转换");
        typeCInterface.typeCRead();
    }
}
