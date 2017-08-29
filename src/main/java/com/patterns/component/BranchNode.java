package com.patterns.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点(Composite)
 * @author bigsea
 * @date 2017-08-29 下午11:28:46
 */
public class BranchNode extends Node {
	
	private List<Node> nodes = null;
	
	public BranchNode(String name, String level) {
		super(name, level);
		nodes = new ArrayList<>();
	}
	
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	@Override
	public void addNode(Node node) {
		nodes.add(node);
	}

	@Override
	public void removeNode(Node node) {
		nodes.remove(node);
	}

	@Override
	public void show() {
		System.out.println(getLevel() + " : " + getName());
		for (Node node : nodes) {
			node.show();
		}
	}

}
