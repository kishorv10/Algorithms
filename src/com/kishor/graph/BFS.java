/**
 * 
 */
package com.kishor.graph;


/**
 * @author KISHOR
 *
 */
public class BFS {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		performBFS(GraphUtils.getRandomDAC(),0);

	}

	private static void performBFS(int[][] g, int n) throws Exception {
		
		int vertices_count = g[0].length; 
		Set s = new Set(vertices_count);		
		Queue q = new Queue(vertices_count);		
		q.enqueue(1);	
		while(!q.isQueueEmpty()) {
			int current = (Integer) q.dequeue();
			if(s.cotains(current)){
				continue;
			}
			s.add(current);
			System.out.print(current + ",");
			addAdjacentsToQueue(g[current -1], q, s);
		}
		
	}

	private static void addAdjacentsToQueue(int[] is, Queue q, Set s) throws Exception {
		for(int i=0;i<is.length;i++) {
			if(is[i] != 0) {
				if(s.cotains(i+1)) {
					continue;
				}
				q.enqueue(i+1);
			}
		}
		
	}
	
	

}
