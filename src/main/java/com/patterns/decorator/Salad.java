package com.patterns.decorator;
/**
 * 具体的装饰类(ConcreteDecorator)
 * @author bigsea
 * @date 2017-08-30 下午5:24:22
 */
public class Salad extends Menu {

	public Salad(Dinner dinner) {
		super(dinner);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("沙拉");
	}
}
