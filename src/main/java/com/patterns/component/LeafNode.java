package com.patterns.component;
/**
 * 叶子节点(Leaf)
 * @author bigsea
 * @date 2017-08-29 下午11:25:35
 */
public class LeafNode extends Node {

	public LeafNode(String name, String level) {
		super(name, level);
	}

	@Override
	public void addNode(Node node) {
		System.out.println("叶子节点不能增加子节点...");
	}

	@Override
	public void removeNode(Node node) {
		System.out.println("叶子节点没有子节点, 不能够删除...");
	}

	@Override
	public void show() {
		System.out.println(getLevel() + " : " + getName());
	}

}
