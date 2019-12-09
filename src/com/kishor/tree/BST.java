package com.kishor.tree;

public class BST {
	
	public static boolean isBST(TreeNode root, int min, int max) {
		
		
		if(root == null) {
			return true;
		}
		int data  = root.data;
		
		if(data < min || data > max) {
			 return false;
		}
		
		if(root.left != null && root.left.data > data) {
			return false;
		}
		
		if(root.right != null && root.right.data < data) {
			return false;
		}
		
		if(!(isBST(root.left, min, data-1) && isBST(root.right,data-1,max))) {
			return false;
		}
		
		return true;
	}

}
