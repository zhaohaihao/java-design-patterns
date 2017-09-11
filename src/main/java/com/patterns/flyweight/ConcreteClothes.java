package com.patterns.flyweight;
/**
 * 具体享元类(ConcreteFlyweight)
 * @author bigsea
 * @date 2017-09-11 上午9:10:23
 */
public class ConcreteClothes implements Clothes {
	
	private String name;
	
	private String size;
	
	private String color;
	
	public ConcreteClothes(String name) {
		this.name = name;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void buy(UnsharedConcreteClothes unsharedConcreteClothes) {
		System.out.println("ConcreteClothes [name=" + name + ", size=" + size + ", color=" + color + ", price="
				+ unsharedConcreteClothes.getPrice() + "]");
	}

}
