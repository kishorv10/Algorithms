/**
 * 
 */
package com.kishor.janchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kishor
 * 
 */
public class CHEFSTON {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcaseCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcaseCount; i++) {
			int maxProfit = 0;
			String nk = br.readLine();

			String[] nkA = nk.split(" ");
			int storeKinds = Integer.parseInt(nkA[0]);
			int time = Integer.parseInt(nkA[1]);

			String[] timeArray = br.readLine().split(" ");
			String[] profitArray = br.readLine().split(" ");

			for (int j = 0; j < storeKinds; j++) {
				int pickTime = Integer.parseInt(timeArray[j]);
				int profit = Integer.parseInt(profitArray[j]);

				int currentProfit = profit * (time/pickTime);
				
				if (currentProfit > maxProfit) {
					maxProfit = currentProfit;
				}
			}
			System.out.println(maxProfit);
		}

	}

}
