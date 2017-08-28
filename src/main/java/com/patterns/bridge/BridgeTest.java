package com.patterns.bridge;
/**
 * 桥接测试类
 * @author bigsea
 * @date 2017-08-28 上午8:59:54
 */
public class BridgeTest {
	public static void main(String[] args) {
		Pen p;
		p = new BallPen();
		
		p.setShape(new Circle());
		p.draw();
		
		p.setShape(new Square());
		p.draw();
		
		p = new Pencil();
		
		p.setShape(new Circle());
		p.draw();
		
		p.setShape(new Square());
		p.draw();
	}
}
