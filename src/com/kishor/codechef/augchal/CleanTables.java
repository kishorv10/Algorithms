/**
 * 
 */
package com.kishor.codechef.augchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KISHOR
 * 
 */
public class CleanTables {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcase_cout; i++) {
			String nk = br.readLine();
			String[] countArray = nk.split(" ");
			int table_count = Integer.parseInt(countArray[0]);
			int cust_count = Integer.parseInt(countArray[1]);

			String orders_string = br.readLine();
			String[] orderArray = orders_string.split(" ");
			int order[] = new int[cust_count];
			for (int j = 0; j < cust_count; j++) {
				order[j] = Integer.valueOf(orderArray[j]);
			}
			
			int[] tables = new int[table_count];
			int clean_count = 0;
			for(int j=0,k=0;j<cust_count;j++) {
				if(tableContainsOrder(tables, order[j])) {
					continue;
				}
				if(ifTableIsFree(tables)) {					
						tables[k++] = order[j];
						clean_count++;					
				} else {
					int table_rownum = findTableToClean(tables, order, i);
					if(table_rownum < 0) {
						System.out.println("some problem");
						continue;
					}
					tables[table_rownum] = order[j];
					clean_count++;
				}
			}	
			System.out.println(clean_count);
		}
	}

	private static int findTableToClean(int[] tables, int[] order, int pointer) {
		int max = 0;
		int table = -1;
		for(int i=0;i<tables.length;i++) {			
			int length = nextRepeatedOrderLength(order, tables[i], pointer);
			if(length == 0) {
				return i;
			}
				if(max <= length) {
					max = length;
					table = i;
				}			
		}
		return table;
	}

	private static int nextRepeatedOrderLength(int[] order, int thisorder, int pointer) {
		int count = 0;
		int length = 0;
		for(int i=pointer;i<order.length;i++) {
			if(order[i] == thisorder) {
				count++;
				if(count == 1) {
					length = i;
				}
			}
			if(count > 1) {
				return i-length;
			}
		}
		return 0;
	}

	private static boolean tableContainsOrder(int[] tables, int order) {
		for(int i=0;i<tables.length;i++) {
			if(tables[i] == order) {
				return true;
			}
		}
		return false;
	}

	private static boolean ifTableIsFree(int[] tables) {
		for(int i=0;i<tables.length;i++) {
			if(tables[i] == 0) {
				return true;
			}
		}
		return false;	
	}

}
