package com.patterns.decorator;
/**
 * 具体的装饰类(ConcreteDecorator)
 * @author bigsea
 * @date 2017-08-30 下午5:06:11
 */
public class Steak extends Menu {

	public Steak(Dinner dinner) {
		super(dinner);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("牛排");
	}
	
}
