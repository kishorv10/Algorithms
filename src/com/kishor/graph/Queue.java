/**
 * 
 */
package com.kishor.graph;

/**
 * @author KISHOR
 *
 */
public class Queue {

	int rear;
	int front;
	Object[] a;
	int n;
	
	public Queue(int n) {
		rear = -1;
		front = -1;
		this.n = n;
		this.a =  new Object[n];
	}
	
	public boolean enqueue(Object value) throws Exception {
		if(front == n-1) {
			throw new Exception("Queue is full");
		}
		if(rear == -1) {
			 front = 0;
			 rear = 0;
		}
		a[rear++] = value;
		return true;
	}
	
	public Object dequeue() throws Exception {
		return a[front++];
	}
	
	public boolean isQueueEmpty() {
		if(front >= rear) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return a.toString();
	}

	
	
}
