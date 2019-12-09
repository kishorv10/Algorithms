package com.kishor.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sample {

public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcaseCount = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcaseCount;i++) {
			int n = Integer.parseInt(br.readLine());
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());			
			findlastStone(n,a,b);
		}
	}

	private static void findlastStone(int n, int a, int b) {
		int lastpave = 0;
		if(n==1) {
			System.out.println(lastpave);
			lastpave = 0;
		}		
		lastpave = lastpave + a;
		findlastStone(n-1, a, b);
		lastpave = lastpave + b;
		findlastStone(n-1, a, b);			
		}

}
