package com.kishor.linkedlists;

public class Node {
	
	int data;
	Node next;
	
	public static Node constructLinkedListFromArray(int[] a) {
		
		Node head = null;
		
		for(int i : a) {
			if (head == null) {
				head  = new Node();
				head.data = i;
				head.next = null;
			} else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				Node newN = new Node();
				newN.data = i;
				newN.next = null;
				temp.next = newN;
			}
			
		}
		
		return head;
	}
	
	public static void printList(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println();
	}
	
	

}
