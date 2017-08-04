package com.patterns.abstractFactory;
/**
 * @author bigsea
 * @date 2017-08-04 上午11:07:56
 * 抽象的工厂 Factory
 * 即工厂的工厂
 */
public interface Factory {
	Phone createPhone();
	Computer createComputer();
}
