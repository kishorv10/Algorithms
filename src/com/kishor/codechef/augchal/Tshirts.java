package com.kishor.codechef.augchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tshirts {
	static int person_count = 0;
	static int arrange_count = 0;
	static int[] arrangment;
	
	public static void main(String as[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_cout;i++) {
			person_count = Integer.parseInt(br.readLine());;
			arrangment = new int[person_count];
			int dp[][] = new int[person_count][101];
			for(int j=0;j<person_count;j++) {
				String dresses = br.readLine();
				String[] dressarray = dresses.split(" ");
				int length = dressarray.length; 
				dp[j][0] = length;
				for(int k=0;k<length;k++) {
					dp[j][k+1] = Integer.parseInt(dressarray[k]);
				}
			}
			arrange_count = 0;
			arrangeshirts(dp, 0);
			System.out.println(arrange_count);
		}
	}

	private static void arrangeshirts(int[][] dp, int person) {
		if(person == person_count) {			
			arrange_count++;						
			return;
		}		
		for(int i=0;i<dp[person][0];i++) {
			if(checkifDuplicate(dp[person][i+1], person)) {
				continue;				
			} else {
				arrangment[person] = dp[person][i+1];
			}			
			arrangeshirts(dp, person+1);
		}
		
	}

	private static boolean checkifDuplicate(int value, int pointer) {
		for(int i=0;i<pointer+1;i++) {
			if(arrangment[i] == value) {
				return true;
			}
		}
		return false;
	}

}
