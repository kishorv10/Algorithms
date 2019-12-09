package com.kishor.amazon;

public class FindRepeatingChars {
	public static void main(String as[]) {
		findRepeat("abbccdd");
	}
	
	public static void findRepeat(String s) {
		
		if(s == null || s.length() == 0) {
			return;
		}
		
		int alphabets[] = new int[26];
		int length = s.length();
		
		for(int i=0;i<length;i++) {
			char ch = s.charAt(i);
			alphabets[ch - 'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(alphabets[i] > 1) {
				System.out.println((char)(i + 'a'));
			}
		}
		
	}
}
