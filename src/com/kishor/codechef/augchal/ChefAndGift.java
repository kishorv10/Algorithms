/**
 * 
 */
package com.kishor.codechef.augchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KISHOR
 *
 */
class ChefAndGift {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_cout;i++) {
			String nk = br.readLine();
			String[] countArray = nk.split(" ");
			int n = Integer.parseInt(countArray[0]);
			int k = Integer.parseInt(countArray[1]);
			
			String numbers = br.readLine();
			String[] numberArray = numbers.split(" ");
			int a[] = new int[n];
			for(int j=0;j<n;j++) {
				a[j] = Integer.valueOf(numberArray[j]);				 
 			}
			if(giftExists(a,n,k)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

	private static boolean giftExists(int[] a, int n, int k) {
		int evenCount = 0;
		for(int i=0;i<n;i++) {
			if(a[i]%2 == 0) {
				evenCount++;
			}			
		}
		if(k==0 & evenCount == n) {
			return false;
		} else if(k <= evenCount) {
			return true;
		} else {
			return false;
		}
	}

}
