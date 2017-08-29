package com.patterns.component;
/**
 * 组合测试类
 * @author bigsea
 * @date 2017-08-29 下午11:33:28
 */
public class ComponentTest {
	public static void main(String[] args) {
		BranchNode root = new BranchNode("Node A", "1");
		BranchNode branchNodeB = new BranchNode("Node B", "1-1");
		BranchNode branchNodeC = new BranchNode("Node C", "1-2");
		
		branchNodeB.getNodes().add(new LeafNode("Node D", "1-1-1"));
		branchNodeB.getNodes().add(new LeafNode("Node E", "1-1-2"));
		branchNodeC.getNodes().add(new LeafNode("Node F", "1-2-1"));
		branchNodeC.getNodes().add(new LeafNode("Node G", "1-2-2"));
		
		root.addNode(branchNodeB);
		root.addNode(branchNodeC);
		
		root.show();
	}
}
