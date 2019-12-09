package com.kishor.algos;

/**
 * This program find the set of p digit numbers whose individual digit sum will
 * be S For example if p=2. s=5 then return set will be
 * {(0,5),(1,4),(2,3),(3,2),(4,1),(0,5)} assume for only whole numbers
 * 
 * @author kvasant
 * 
 */
public class FindDigitsForSum {

	public static void main(String asp[]) {
		sub s = new sub(3, 21);
	}

}

class sub {
	int P;
	int S;
	int digit[];

	sub(int p, int s) {
		this.P = p;
		this.S = s;
		digit = new int[p];
		findDigits(P, S);
	}

	void findDigits(int p, int s) {
		for (int i = 0; i < 10; i++) {
			if (p == 1) {
				if (s / 10 == 0 && s >= 0) {
					digit[p - 1] = s;
					print(digit, P);
				}
				return;
			}
			digit[p - 1] = i;
			findDigits(p - 1, s - i);
		}
	}

	private void print(int[] digit2, int p2) {
		for (int i = 0; i < p2; i++) {
			System.out.print(digit2[i]);
		}
		System.out.println();
	}
}