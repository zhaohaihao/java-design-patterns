package com.patterns.bridge;
/**
 * 创建抽象父类 Pen
 * @author bigsea
 * @date 2017-08-28 上午8:55:37
 */
public abstract class Pen {
	
	private String name;
	private Shape shape;
	
	protected Pen(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	protected String drawWhat() {
		return shape.draw();
	}
	
	public abstract void draw();
}
