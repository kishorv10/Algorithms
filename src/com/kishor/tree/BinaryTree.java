package com.kishor.tree;

import com.kishor.graph.Queue;

public class BinaryTree {
	
	 	
	TreeNode getBinaryTree() {		
		TreeNode root = new TreeNode(10);
		
		root.setLeftNode(new TreeNode(20));
		root.setRightNode(new TreeNode(30));
		
		root.getLeftNode().setLeftNode(new TreeNode(40));
		root.getLeftNode().setRightNode(new TreeNode(50));
		
		root.getRightNode().setLeftNode(new TreeNode(60));
		root.getRightNode().setRightNode(new TreeNode(70));
		
		return root;
	}
	
	TreeNode getBinaryTree(int a) {		
		TreeNode root = new TreeNode(10);
		
		root.setLeftNode(new TreeNode(5));
		root.setRightNode(new TreeNode(15));
		
		root.getLeftNode().setLeftNode(new TreeNode(2));
		root.getLeftNode().setRightNode(new TreeNode(6));
		
		root.getRightNode().setLeftNode(new TreeNode(11));
		root.getRightNode().setRightNode(new TreeNode(16));
		
		return root;
	}
	
	
	void inorder(TreeNode root) {
		if(root == null) {
			return;
		}		
		
		inorder(root.getLeftNode());
		System.out.print(root.getData() + " ");
		inorder(root.getRightNode());
		
	}
	
	int[] inorderArray(TreeNode root, int a[]) {
		if(root == null) {
			return a;
		}		
		
		inorder(root.getLeftNode());
		a[]
		inorder(root.getRightNode());
		
	}
	void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}	
		System.out.print(root.getData() + " ");
		preOrder(root.getLeftNode());		
		preOrder(root.getRightNode());
	}
	
	void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}			
		postOrder(root.getLeftNode());		
		postOrder(root.getRightNode());
		System.out.print(root.getData() + " ");
	}
	
	void leveOrder(TreeNode root) throws Exception {
		
		Queue q  = new Queue(10);
		
		q.enqueue(root);
		
		while(!q.isQueueEmpty()) {
			TreeNode node  = (TreeNode) q.dequeue();
			System.out.print(node.getData() + " ");
			if(node.getLeftNode() != null ) {
				q.enqueue(node.getLeftNode());
			}
				
			if(node.getRightNode() != null) {
				q.enqueue(node.getRightNode());
			}
		}
		
		
	}
	
	TreeNode generateBST(TreeNode root) {
		
		
		
		return null;
	}


}

