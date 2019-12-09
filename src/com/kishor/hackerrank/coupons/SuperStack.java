package com.kishor.hackerrank.coupons;

import java.io.*;

public class SuperStack {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] ops = new String[n];

		for (int i = 0; i < n; i++) {
			ops[i] = br.readLine();
		}

		Stack superStack = new Stack(n);

		for (int i = 0; i < n; i++) {
			String operation = ops[i];
			String[] operationArray = operation.split(" ");

			int data;
			int x;
			int elements = operationArray.length;
			if (elements == 1) {
				if (superStack.isStackEmpty()) {
					System.out.println("EMPTY");
				} else {
					superStack.pop();
					if (superStack.isStackEmpty()) {
						System.out.println("EMPTY");
					} else {
						System.out.println(superStack.printTop());
					}
					
				}
			} else if (elements == 2) {

				data = Integer.parseInt(operationArray[1]);

				superStack.push(data);
				System.out.println(superStack.printTop());
			} else {

				x = Integer.parseInt(operationArray[1]);
				data = Integer.parseInt(operationArray[2]);
				superStack.inc(data, x);
				System.out.println(superStack.printTop());
			}
		}

	}
}

class Stack {
	int a[];
	int top;
	int n;

	public Stack(int n) {
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
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void inc(int data, int x) {
		for (int i = top; i >= 0; i--) {
			
			if(i < x) {
				this.a[i] =this.a[i] + data; 
			} else {
				this.a[i] =this.a[i];
			}
				
		}
	}

	public int printTop() {
		return a[top];
	}
}