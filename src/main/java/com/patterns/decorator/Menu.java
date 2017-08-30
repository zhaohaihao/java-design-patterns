package com.patterns.decorator;
/**
 * 抽象装饰器类(Decorator)
 * @author bigsea
 * @date 2017-08-30 下午5:02:26
 */
public abstract class Menu implements Dinner {
	
	protected Dinner dinner;
	
	public Menu(Dinner dinner) {
		this.dinner = dinner;
	}
	
	@Override
	public void eat() {
		dinner.eat();
	}
}
