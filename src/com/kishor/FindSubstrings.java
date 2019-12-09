package com.kishor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSubstrings {
	public static void main(String as[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_cout;i++) {
			int s_length = Integer.parseInt(br.readLine());
			String s = br.readLine();
			int subStringsCount = getEqualSubStringCount(s_length, s);
			System.out.println(subStringsCount);
		}
	}

	private static int getEqualSubStringCount(int length, String s) {
		String[] subStrings = getAllSubStrings(length, s);
		int equalStringCount = 0;
		for(int i=0;i<subStrings.length;i++) {
			if(subStrings[i].charAt(0) == subStrings[i].charAt(length)) {
				equalStringCount ++;
			}
		}
		return equalStringCount;
	}

	private static String[] getAllSubStrings(int length, String s) {
		
		return null;
	}

}
