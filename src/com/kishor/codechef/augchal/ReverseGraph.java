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
public class ReverseGraph {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nm = br.readLine();
		String[] graphcount = nm.split(" ");
		int vertices =Integer.parseInt(graphcount[0]);
		int edges = Integer.parseInt(graphcount[1]);
		int[][] graph = new int[vertices][vertices];
		
		for(int i=0;i<edges;i++) {
			String edge = br.readLine();
			String[] edgevertices = edge.split(" ");
			int edge1 = Integer.parseInt(edgevertices[0]);
			int edge2 = Integer.parseInt(edgevertices[1]);			
			graph[edge1-1][edge2-1] = 1;
		}
		
		int count = performDFS(graph, vertices);
		

	}

	private static int performDFS(int[][] graph, int vertices) {
		
		return 0;
	}

}
