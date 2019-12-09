/**
 * 
 */
package com.kishor.graph;

/**
 * @author KISHOR
 *
 */
public class DFS {

	static Set s;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		int g[][] = GraphUtils.getRandomDAC();
		int vertex_count = g[0].length;
		s = new Set(vertex_count);
		dfsearch(g, 0);
		s.print();
	}

	private static void dfsearch(int[][] g, int vertex) {
		if(s.cotains(vertex)) {
			return;
		}
		s.add(vertex);
		int edges[] = g[vertex];
		for(int i=0;i<edges.length;i++) {
			if(edges[i] == 0 || s.cotains(i)) {
				continue;
			} 
			dfsearch(g, i);
		}
		
	}

}
