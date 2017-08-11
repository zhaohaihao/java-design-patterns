package com.patterns.builder;
/**
 * @author bigsea
 * @date 2017-08-11 上午9:05:12
 * 具体的建造者类 MacProFirstBuilder
 */
public class MacProFirstBuilder implements Builder {

	private MacPro macPro = new MacPro();

    @Override
    public void buildProcessor() {
        macPro.addPart("i5");
        macPro.addPrice(1500d);
    }

    @Override
    public void buildMemory() {
        macPro.addPart("8GB");
        macPro.addPrice(400d);
    }

    @Override
    public void buildStorage() {
        macPro.addPart("128GB");
        macPro.addPrice(1500d);
    }

    @Override
    public void buildBar() {
        macPro.addPart("with Bar");
        macPro.addPrice(1200d);
    }

    @Override
    public MacPro getResult() {
        return macPro;
    }

}
