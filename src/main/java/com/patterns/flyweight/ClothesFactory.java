package com.patterns.flyweight;
/**
 * 享元工厂类(FlyweightFactory)
 * @author bigsea
 * @date 2017-09-11 上午9:19:44
 */

import java.util.HashMap;

public class ClothesFactory {
	
	private static final HashMap<String, Clothes> clothesMap = new HashMap<>();
	
	public static Clothes getClothes(String name) {
		ConcreteClothes clothes = (ConcreteClothes)clothesMap.get(name);
		
		if (clothes == null) {
			System.out.println("Instance of name = " + name + " does not exists, creating it!");
			clothes = new ConcreteClothes(name);
			System.out.println("Instance of name = " + name + " created!");
			clothesMap.put(name, clothes);
		}
		return clothesMap.get(name);
	}
	
	public static void getClothesTypeCount() {
		System.out.println("Type of clothes is " + clothesMap.size() + " !");
	}
}
