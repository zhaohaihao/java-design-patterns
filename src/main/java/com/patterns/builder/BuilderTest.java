package com.patterns.builder;
/**
 * @author bigsea
 * @date 2017-08-11 上午9:07:11
 * 建造者测试类 BuilderTest
 */
public class BuilderTest {
	public static void main(String[] args) {
        Director d = new Director();
        MacProFirstBuilder mpfb = new MacProFirstBuilder();
        MacProSecondBuilder mpsb = new MacProSecondBuilder();

        d.construct(mpfb);
        mpfb.getResult().showMacPro();

        d.construct(mpsb);
        mpsb.getResult().showMacPro();
    }
}
