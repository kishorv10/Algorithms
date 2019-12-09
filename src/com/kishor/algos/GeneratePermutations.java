package com.kishor.algos;
/**
 * This Class Generates permutations for a given number, Can be extended to
 * String also. Repeating digits are not allowed. 
 * Sample Output:
 * Permutations of 123 are :
123
132
213
231
312
321
No of Permutations are: 6

 * 
 * @author KISHOR
 * 
 */
public class GeneratePermutations {

	public static void main(String as[]) {
		int word = 25648;
		System.out.println("Permutations of " + word +" are :");

		Permutations p = new Permutations(word);
		int[] digitArray = p.getDigitArrayForNumber();
		p.generatePerms(digitArray, digitArray.length);
		System.out.println("No of Permutations are: " + p.getPermCount());
	}

}

class Permutations {

	int number;
	int NUMBER_LENGTH;
	int[] perm;
	int perm_count = 0;

	Permutations(int number) {
		this.number = number;
		NUMBER_LENGTH = getDigitCount(number);
		perm = new int[NUMBER_LENGTH];
	}

	int[] getDigitArrayForNumber() {
		int n = number;
		int count = getDigitCount(n);
		int[] a = new int[count];

		while (n / 10 > 0) {
			a[--count] = n % 10;
			n = n / 10;
		}
		a[0] = n;
		return a;
	}

	private int getDigitCount(int n) {
		int dc = 1;

		while (n / 10 > 0) {
			dc++;
			n = n / 10;
		}
		return dc;
	}

	void generatePerms(int[] a, int length) {
		if (length == 1) {

			perm[NUMBER_LENGTH - length] = a[0];
			print(perm);
			return;
		}

		for (int i = 0; i < length; i++) {
			perm[NUMBER_LENGTH - length] = a[i];
			int b[] = constructSubArray(a, i, length);
			generatePerms(b, length - 1);
		}
		return;
	}

	private void print(int[] perm2) {

		for (int i = 0; i < NUMBER_LENGTH; i++) {
			System.out.print(perm2[i]);
		}
		perm_count++;
		System.out.println();
	}

	private int[] constructSubArray(int[] a, int position, int length) {
		int b[] = new int[length];
		for (int i = 0, k = 0; i < length; i++) {
			if (i == position) {
				continue;
			}
			b[k++] = a[i];
		}
		return b;
	}

	int getPermCount() {
		return perm_count;
	}

}
