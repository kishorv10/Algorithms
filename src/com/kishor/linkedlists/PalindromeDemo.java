package com.kishor.linkedlists;

public class PalindromeDemo {
	
	public static void main(String[] args) {
		PalindromeFinder pf = new PalindromeFinder();
		
		//testMiddleMethod(pf);
		//testReverseList(pf);
		testCheckPalindrome(pf);
	}
	
	private static void testCheckPalindrome(PalindromeFinder pf) {
		Node head ;		
		head = Node.constructLinkedListFromArray(new int[]{});		
		System.out.println("{}" + pf.checkPalindrome(head));
					
		head = Node.constructLinkedListFromArray(new int[]{1});		
		System.out.println("{1}" + pf.checkPalindrome(head));
		
				
		head = Node.constructLinkedListFromArray(new int[]{1,2});		
		System.out.println("{1,2}" + pf.checkPalindrome(head));
		
				
		head = Node.constructLinkedListFromArray(new int[]{1,2,3});		
		System.out.println("{1,2,3}" + pf.checkPalindrome(head));
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4});		
		System.out.println("{1,2,3,4}" + pf.checkPalindrome(head));
		
		
		head = Node.constructLinkedListFromArray(new int[]{1,1});		
		System.out.println("{1,1}" + pf.checkPalindrome(head));
	
	
		head = Node.constructLinkedListFromArray(new int[]{1,2,1});		
		System.out.println("{1,2,1}" + pf.checkPalindrome(head));
		
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,2,1});		
		System.out.println("{1,2,2,1}"  + pf.checkPalindrome(head));
		
		head = Node.constructLinkedListFromArray(new int[]{1,1});		
		System.out.println("{1,1}" + pf.checkPalindrome(head));
	
	
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,2,1});		
		System.out.println("{1,2,3,2,1}"  + pf.checkPalindrome(head));
		
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,3,2,1});		
		System.out.println("{1,2,3,3,2,1}" + pf.checkPalindrome(head));

		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4,5,6,5,4,3,3,2,1});		
		System.out.println("{1,2,3,4,5,6,5,4,3,3,2,1}" + pf.checkPalindrome(head));

	}
	
	private static void testReverseList(PalindromeFinder pf) {
		Node head ;
		Node reverse ;
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4});		
		reverse = pf.reverseList(head);
		System.out.println("reverse array: ");
		Node.printList(reverse);
		
		head = Node.constructLinkedListFromArray(new int[]{});		
		reverse = pf.reverseList(head);
		System.out.println("reverse array: ");
		Node.printList(reverse);
		
		head = Node.constructLinkedListFromArray(new int[]{1});		
		reverse = pf.reverseList(head);
		System.out.println("reverse array: ");
		Node.printList(reverse);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2});		
		reverse = pf.reverseList(head);
		System.out.println("reverse array: ");
		Node.printList(reverse);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4,5,6,7,8,9});		
		reverse = pf.reverseList(head);
		System.out.println("reverse array: ");
		Node.printList(reverse);
	}

	static void testMiddleMethod(PalindromeFinder pf ) {
		Node head = null;
		Node middle = null;
		
		head = Node.constructLinkedListFromArray(new int[]{});
		middle = pf.findMiddleNode(head);
		System.out.println(middle);
		
		head = Node.constructLinkedListFromArray(new int[]{1});
		middle = pf.findMiddleNode(head);
		System.out.println(middle.data);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2});
		middle = pf.findMiddleNode(head);
		System.out.println(middle.data);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3});
		middle = pf.findMiddleNode(head);
		System.out.println(middle.data);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4,5,6,7,8});
		middle = pf.findMiddleNode(head);
		System.out.println(middle.data);
		
		head = Node.constructLinkedListFromArray(new int[]{1,2,3,4,5,6,7});
		middle = pf.findMiddleNode(head);
		System.out.println(middle.data);
		
	}

}
