package com.kishor.hackerrank.coupons;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LastStone {
	static int N;
	static Set<Integer> lastStoneSet = new HashSet<Integer>();
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcaseCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcaseCount; i++) {
			N = Integer.parseInt(br.readLine());
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			findlastStone(0, a, b,0);
			
			List<Integer> lastStoneList = new ArrayList<Integer>(lastStoneSet);
			Collections.sort(lastStoneList);
			for(Integer value : lastStoneList) {
				System.out.print(value + " ");
			}
			
			lastStoneSet.clear();
		}
	}

	private static void findlastStone(int n, int a, int b, int lastpave) {
		
		if (n == N-1) {
			lastStoneSet.add(lastpave);		
			return;
		}	
		
			findlastStone(n+1,a,b,lastpave+a);
			findlastStone(n+1,a,b,lastpave+b);
		
	}
}
