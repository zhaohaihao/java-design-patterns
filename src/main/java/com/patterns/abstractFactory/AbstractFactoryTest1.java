package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:24:11
 * 用反射改进抽象工厂的测试类
 */
public class AbstractFactoryTest1 {
	public static void main(String[] args) throws Exception {
		Computer c = Factory1.createComputer(MiComputer.class);
		c.play();
	}
}
