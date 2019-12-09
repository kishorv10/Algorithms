package com.kishor.decchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CAPPLE {

	public static void main(String as[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase_count = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_count;i++) {			
			int treecount = Integer.parseInt(br.readLine());
			int tree[] =  new int[treecount];
			String trees = br.readLine();
			String[] treeArray = trees.split(" ");
			for(int j=0;j<treecount;j++) {
				tree[j] = Integer.parseInt(treeArray[j]);
			}
			
			sort(tree, treecount);			
			int min = 1;
			
			for(int j=0;j<treecount-1;j++) {
				if(tree[j] != tree[j+1]) {
					for(int k=j;k>=0;k--) {
						tree[k] = tree[j+1];						
					}
					min++;
				}
			}
			
			System.out.println(min);
			
		}
	}

	private static void sort(int[] a, int  length) {
		for(int i=0;i<length;i++) {
			int max = i;
			for(int j=i+1;j<length;j++) {
				if(a[max] < a[j]) {
					max = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
		
	}
}
