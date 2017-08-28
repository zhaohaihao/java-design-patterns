package com.patterns.bridge;
/**
 * Pen 的具体实现类 Pencil
 * @author bigsea
 * @date 2017-08-28 上午8:58:07
 */
public class Pencil extends Pen {

	protected Pencil() {
		super("铅笔");
	}

	@Override
	public void draw() {
		System.out.println(getName() + drawWhat());
	}

}
