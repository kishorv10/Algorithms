/**
 * 
 */
package com.kishor.amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kishor
 *
 */
public class MatrixReverese {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rowSize = Integer.parseInt(br.readLine());
		int colSize = Integer.parseInt(br.readLine());
		
		int matrix[][] = new int[rowSize][colSize];
		
		for(int i=0;i<rowSize;i++) {
			String rowValues = br.readLine();
			String[] rowValueArray = rowValues.split(" ");
			
			for(int j=0;j<colSize;j++) {
				matrix[i][j] = Integer.parseInt(rowValueArray[j]);
			}
		}
		
		for(int colptr =0; colptr < colSize ; colptr++) {
			for(int rowptr = rowSize -1 ; rowptr >= 0; rowptr--) {
				System.out.print(matrix[rowptr][colptr] + " ");
			}
			System.out.println();
		}
		

	}

}
