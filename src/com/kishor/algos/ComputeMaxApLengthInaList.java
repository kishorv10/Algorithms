package com.kishor.algos;
/**
 * Program to find the largest Arithmetic progression in a sorted list.
 * Test cases: {1,2,3,4,5,6,7,8}, {1, 7, 10, 15, 27, 29 }, 
 * { 1, 2, 5, 8, 9, 10, 13, 15, 16, 17, 18, 19, 20 }
 * @author kvasant
 *
 */
public class ComputeMaxApLengthInaList {

	public static void main(String as[]) {
		int a[] = { 1, 2, 5, 8, 9, 10, 13, 15, 16, 17, 18, 19, 20 };
		GetApLength ap = new GetApLength();
		System.out.println("Max AP length is:  " + ap.getMaxApLength(a));
	}
}

class GetApLength {

	int oneLength = 1;

	int getMaxApLength(int a[]) {
		int max = 1;
		int d = 0;
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				length = 2;
				d = a[j] - a[i];
				ap[0] = a[i];
				ap[1] = a[j];
				checkForAp(a, j, j + 1, n, d);
				if (max < length) {
					max = length;
					printAp(ap, max);
				}
			}
		}

		if (max == 1) {
			return 0;
		}
		return max;
	}

	private void printAp(int[] ap2, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(ap2[i] + ",");
		}
		System.out.println();

	}

	int length = 0;
	int[] ap = new int[15];

	private void checkForAp(int[] a, int start, int end, int n, int d) {

		if (start == n || end == n) {
			return;
		}

		if (a[end] - a[start] == d) {
			length++;
			ap[length - 1] = a[end];
			checkForAp(a, end, end + 1, n, d);
		} else {
			checkForAp(a, start, end + 1, n, d);
		}

	}
}