package com.kishor.algos;
/**
 * Program to generate all possible combinations of length k using an array of
 * characters
 * 
 * @author kvasant
 * 
 */
public class GenerateCombinations {

	public static void main(String as[]) {

		char[] chars = { 'a', 'b', 'c', 'd' };
		int key = 2;
		Allcombs c = new Allcombs(chars, key);
		System.out.println("combinations of " + c.printArray(chars) + " are :");
		c.generateCombs(key);

	}

}

class Allcombs {

	char[] comb;
	char[] chars;
	int length;

	Allcombs(char[] chars, int key) {
		this.chars = chars;
		length = this.chars.length;
		comb = new char[key];
	}

	void generateCombs(int position) {
		position--;
		if (position == -1) {
			System.out.println(printArray(comb));
			return;
		}
		for (int i = 0; i < length; i++) {
			comb[position] = chars[i];
			generateCombs(position);
		}
		return;
	}

	String printArray(char[] charArray) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			b.append(charArray[i]);
		}
		return b.toString();
	}
}
