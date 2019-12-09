/**
 * 
 */
package com.kishor.graph;

/**
 * @author KISHOR
 *
 */
public class Stack {
	int a[];
	int top;
	int n;
	
	Stack(int n) {
		this.n = n;
		a = new int[n];
		top = -1;
	}
	
	public boolean push(int value) {		
		a[++top] = value;
		return true;
	}
	
	public int pop() {		
		return a[top--];
	}
	
	public boolean isStackEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

}
