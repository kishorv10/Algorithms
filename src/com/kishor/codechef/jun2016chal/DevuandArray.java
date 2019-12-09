/**
 * 
 */
package com.kishor.codechef.jun2016chal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kishor
 *
 */
public class DevuandArray {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
		int arrayCount = Integer.parseInt(firstLine[0]);
		int queryCount = Integer.parseInt(firstLine[1]);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String[] secondLine = br.readLine().split(" ");
		for(int i=0;i<arrayCount;i++) {
			int data = Integer.parseInt(secondLine[i]);			
			if(data<min) 
				min = data;
			if(data>max)
				max = data;
		}
		
		for(int i=0;i<queryCount;i++) {
			int queryValue = Integer.parseInt(br.readLine());
			if(min<=queryValue && queryValue<=max) {
				System.out.println("Yes");
			} else 
				System.out.println("No");
		}
		
	}

}
