package com.kishor.algos;

public class Pow {
	
	public static void main(String as[]) {
		System.out.println(findPow(2,5));
	}

	private static int findPow(int i, int j) {
		
		if(j==1) {
			return i;
		}
		
		if(j%2 == 0) {
			int z = findPow(i,j/2);
			i = z*z;
		} else {
			int z = findPow(i,j/2);
			i = z*z*i;
		}
		
		
		return i;
	}

}
