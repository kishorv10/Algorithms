/**
 * 
 */
package com.kishor.graph;

/**
 * @author KISHOR
 *
 */
public class Set {
	int n;
	int a[];
	int rear = 0;
	
	Set(int n) {
		this.n=n;
		a = new int[n];
	}
	
	public boolean add(int value) {

		if(rear == n) {
			return false;
		}
		
		a[rear++] = value+1;
		return true;
	}
	
	public boolean cotains(int value) {
		for(int i=0;i<n;i++) {
			if (a[i] == value+1) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for(int i=0;i<n;i++) {
			System.err.print(a[i] + "," );
		}
	}
}
