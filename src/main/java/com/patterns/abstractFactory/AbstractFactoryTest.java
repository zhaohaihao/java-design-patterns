package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:19:19
 * 抽象工厂测试类 AbstractFactoryTest
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		Factory f = new IFactory();
		Computer c = f.createComputer();
		c.play();
	}
}
