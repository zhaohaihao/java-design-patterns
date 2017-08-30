package com.patterns.decorator;
/**
 * 具体的装饰类(ConcreteDecorator)
 * @author bigsea
 * @date 2017-08-30 下午5:07:17
 */
public class Spaghetti extends Menu {

	public Spaghetti(Dinner dinner) {
		super(dinner);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("意大利面");
	}
}
