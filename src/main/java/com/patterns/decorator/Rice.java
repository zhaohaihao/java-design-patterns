package com.patterns.decorator;
/**
 * 具体的装饰类(ConcreteDecorator)
 * @author bigsea
 * @date 2017-08-30 下午5:08:53
 */
public class Rice extends Menu {

	public Rice(Dinner dinner) {
		super(dinner);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("米饭");
	}
}
