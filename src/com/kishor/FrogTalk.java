package com.kishor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrogTalk {

	static int frog_count;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputs = input.split(" ");
		
		frog_count = Integer.parseInt(inputs[0]);
		int distance = Integer.parseInt(inputs[1]);
		int pair_count = Integer.parseInt(inputs[2]);
		
		String coord = br.readLine();
		String[] coords = coord.split(" ");
				
		int[] frogs = new int[frog_count];
		for(int i=0;i<frog_count;i++) {
			frogs[i] = Integer.parseInt(coords[i]);
		}
		
		int[][] distnaceMatrix; 
		
		distnaceMatrix = populateDistanceMatrix(frogs,frog_count,distance);
		System.out.println("distance matrix");
		for(int i=0;i<frog_count;i++) {
			for (int j=0; j<frog_count;j++) {
				System.out.print(distnaceMatrix[i][j] + " ");
			}
			System.out.println();
		}

		for(int i=0;i<pair_count;i++) {
			String pair = br.readLine();
			String[] pairs = pair.split(" ");
			int source_index = Integer.parseInt(pairs[0]);
			int destination_index = Integer.parseInt(pairs[1]);
			
			if(canTheyTalk(source_index, destination_index,distnaceMatrix)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}		
		
	}


	private static boolean canTheyTalk(int source_index, int destination_index, int[][] distnaceMatrix) {
		int pointer = 0;
		int a[] = distnaceMatrix[source_index-1];
		if(ifSourceDistnceMatrixisNull(source_index, pointer, distnaceMatrix[source_index])) {
			return false;
		} 
		if(containsDestination(destination_index, pointer, distnaceMatrix[source_index])) {
			return true;
		}		
		
		return false;
	}


	private static boolean containsDestination(
			int destination_index, int pointer, int[] is) {
		for(int i=pointer;i<frog_count;i++) {
			if(is[i] != destination_index + 1 ) {
				return true;
			}
		}
		return false;
	}


	private static boolean ifSourceDistnceMatrixisNull(int source_index,int pointer, int[] distnaceMatrix) {
		for(int i=pointer;i<frog_count;i++) {
			if(distnaceMatrix[i] != 0) {
				return true;
			}
		}
		return false;
	}


	private static int findIndex(int source, int[] a) {
		for(int i=0;i<frog_count;i++) {
			if(a[i] == source) {
				return i;
			}
		}
		return -1;
	}

	private static int[][] populateDistanceMatrix(int[] a, int length, int distance) {
		int[][] distnaceMatrix = new int[length][length];
		for(int i=0;i<length;i++) {
			int  k=0;
			distnaceMatrix[i][k++] = i+1;
			for(int j=0;j<length;j++) {							
				if(a[i]-a[j] > 0 && a[i] - a[j] <= distance || a[i]-a[j] < 0 && a[j] - a[i] <= distance) {
					distnaceMatrix[i][k] = j+1;
					k++;
				}
			}
		}
		return distnaceMatrix;
	}

	

}
