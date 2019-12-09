package com.kishor.algos;

/**
 * This program is a classical Dynamic - greedy algorithm problem. Problem
 * Statement: Given an array of coin denominations and value S. We need to find
 * the smallest no of coins to be used whose sum is S should return -1 is we
 * can't compute sum with given denominations. Any number of coins exists.
 * Example: denominations are : {2, 3, 4, 7} S = 23; 
 * Output is : 4 i.e. 7*(3) + 2*(1) = 23
 * 
 * @author KISHOR
 * 
 */
public class DenomWeight {

	public static void main(String asp[]) {

		Sub1 obj = new Sub1();
		obj.mainMethod();
	}
}

class Sub1 {
	int[] d = { 2, 3, 4, 7 };
	int sum = 23;
	int length = d.length;
	int[] w = new int[length];
	int weightLength = 9999999;

	void mainMethod() {
		findSum(d, length - 1);
		if (weightLength == 9999999) {
			System.out.println("Answer: " + -1);
		} else {
			System.out.println("Answer: " + weightLength);
		}

	}

	void findSum(int[] denom, int position) {

		if (position == -1) {
			return;
		}

		for (int i = 0; i <= sum / denom[position]; i++) {

			w[position] = i;
			if (position == 0) {
				if (sum == computeSum(d, w)) {
					if (weightLength > findWeightLength(w)) {
						weightLength = findWeightLength(w);
						continue;
					}
				}
			}
			findSum(d, position - 1);
		}
		return;
	}

	int computeSum(int[] d, int[] w) {
		int productSum = 0;
		for (int i = 0; i < length; i++) {
			productSum = productSum + d[i] * w[i];
		}
		return productSum;
	}

	int findWeightLength(int[] w) {
		int wtSum = 0;
		for (int i = 0; i < length; i++) {
			wtSum = wtSum + w[i];
		}
		return wtSum;
	}
}
