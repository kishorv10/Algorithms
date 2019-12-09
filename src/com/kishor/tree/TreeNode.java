package com.kishor.tree;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return left;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.left = leftNode;
	}
	public TreeNode getRightNode() {
		return right;
	}
	public void setRightNode(TreeNode rightNode) {
		this.right = rightNode;
	}
	

}
