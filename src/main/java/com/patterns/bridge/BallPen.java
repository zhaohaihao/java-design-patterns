package com.patterns.bridge;
/**
 * Pen 的具体实现类 BallPen
 * @author bigsea
 * @date 2017-08-28 上午8:59:19
 */
public class BallPen extends Pen {

	protected BallPen() {
		super("圆珠笔");
	}

	@Override
	public void draw() {
		System.out.println(getName() + drawWhat());
	}

}
