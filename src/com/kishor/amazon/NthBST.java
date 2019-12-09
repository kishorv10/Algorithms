package com.kishor.amazon;

import com.kishor.tree.TreeNode;

public class NthBST {

	public static void printNNode(TreeNode root, int N) {
		if(root == null) {
			return;
		}
		
		int index = 0;
		
		printNNode(root.right, N);
		
		if(++index == N) {
			System.out.println(root.data);
			return;
		}
		
		LargeBST bst = new LargeBST();
		bst.nLargestBST(root, index);
		System.out.println(bst.nLargest);
	}
	
	private static class LargeBST {
	    static int currCount = 0;
	    static int nLargest = 0;
	    
	    public void nLargestBST(TreeNode root, int N) {
	        if(root == null || currCount > N) {		  	
	        return;
		   }	
	        nLargestBST(root.right, N);	
		   currCount++;
	        if(currCount == N) {
	            nLargest = root.data;
	        }
	        nLargestBST(root.left, N);    
	    }   
	}
}
