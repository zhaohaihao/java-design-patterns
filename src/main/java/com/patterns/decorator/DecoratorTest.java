package com.patterns.decorator;
/**
 * 装饰器测试类
 * @author bigsea
 * @date 2017-08-30 下午5:10:11
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		System.out.println("今天吃中餐");
		Dinner cmd = new ChineseMeal();
		Rice rice = new Rice(cmd);
		BoiledMeat boiledMeat = new BoiledMeat(rice);
		boiledMeat.eat();
		
		Rice rice1 = new Rice(cmd);
		BoiledFish boiledFish = new BoiledFish(rice1);
		boiledFish.eat();
		
		System.out.println("----------------\n\n今天吃西餐");
		Dinner wmd = new WesternStyleMeal();
		Salad salad = new Salad(wmd);
		Steak steak = new Steak(salad);
		steak.eat();
		
		Salad salad1 = new Salad(wmd);
		Spaghetti spaghetti = new Spaghetti(salad1);
		spaghetti.eat();
	}
}
