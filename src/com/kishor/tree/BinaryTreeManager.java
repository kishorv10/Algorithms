package com.kishor.tree;

public class BinaryTreeManager {
	
	public static void main(String as[]) throws Exception {
		
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.getBinaryTree(1);
		
		System.out.println("Is BST: " + BST.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		
		System.out.println("Inorder");
		bt.inorder(root);
//		System.out.println("\nPreorder");
//		bt.preOrder(root);
//		System.out.println("\nPostorder");
//		bt.postOrder(root);
//		
//		System.out.println("\n Level Order");
//		bt.leveOrder(root);
	}
}
