/**
 * 
 */
package com.kishor.linkedlists;

/**
 * @author Kishor
 *
 */
public class PalindromeFinder {
	
	public boolean checkPalindrome(Node head) {
		
		if(head == null) {
			return false;
		}
		
		if(head.next == null) {
			return true;
		}
		
		Node middle = findMiddleNode(head);
		Node list2 = middle.next;
		list2 = reverseList(list2);
		
		return compareElements(head,list2);
	}

	public boolean compareElements(Node head, Node list2) {
		Node temp = list2;
		
		while(head != list2 && head != null && temp != null) {
			if(head.data != temp.data) {
				return false;
			}
			head = head.next;
			temp = temp.next;
		}
		return true;
	}

	public Node reverseList(Node list) {
		
		if(list == null) {
			return null;
		}
		
		if(list.next == null) {
			return list;
		}
	
		Node balance = list.next;
		list.next = null;
		while(balance != null) {
			Node temp = balance.next;
			balance.next = list;
			list = balance;
			balance = temp;			
		}
		return list;
	}

	public Node findMiddleNode(Node head) {
		
		Node ptr1 = head;
		Node ptr2 = head;
		
		
		while(ptr2 != null && ptr2.next != null && ptr2.next.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		
		return ptr1;
		
	}

}
