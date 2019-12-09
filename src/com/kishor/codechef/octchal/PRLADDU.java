package com.kishor.codechef.octchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRLADDU {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_cout;i++) {
			String nm = br.readLine();
			String[] countArray = nm.split(" ");
			int n = Integer.parseInt(countArray[0]);
			int m = Integer.parseInt(countArray[1]);
			
			String numbers = br.readLine();
			String[] numberArray = numbers.split(" ");
			int a[] = new int[n];
			for(int j=0;j<n;j++) {
				a[j] = Integer.valueOf(numberArray[j]);				 
 			}
			
		}

	}

}
