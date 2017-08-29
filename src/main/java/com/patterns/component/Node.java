package com.patterns.component;
/**
 * 节点抽象类(Component)
 * @author bigsea
 * @date 2017-08-29 下午11:20:10
 */
public abstract class Node {
	
	private String name;
	
	private String level;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Node(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}

	public abstract void addNode(Node node);
	
	public abstract void removeNode(Node node);
	
	public abstract void show();
}
