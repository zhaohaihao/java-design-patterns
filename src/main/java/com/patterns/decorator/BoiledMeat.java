package com.patterns.decorator;
/**
 * 具体的装饰类(ConcreteDecorator)
 * @author bigsea
 * @date 2017-08-30 下午5:08:10
 */
public class BoiledMeat extends Menu {

	public BoiledMeat(Dinner dinner) {
		super(dinner);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("水煮牛肉");
	}
}
