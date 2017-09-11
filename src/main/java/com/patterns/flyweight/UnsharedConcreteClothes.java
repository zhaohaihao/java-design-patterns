package com.patterns.flyweight;
/**
 * 非共享享元实现类(UnsharedConcreteFlyweight)
 * @author bigsea
 * @date 2017-09-11 上午9:43:47
 */
public class UnsharedConcreteClothes implements Clothes {
	
	private String price;
	
	public UnsharedConcreteClothes(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public void buy(UnsharedConcreteClothes unsharedConcreteClothes) {
		System.out.println("UnsharedConcreteClothes [price=" + price + "]");
	}
	
}
