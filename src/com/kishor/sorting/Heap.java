package com.kishor.sorting;

/**
 * Heap sort is one of the best algorithm based on the Heap data structure
 * Worst case -> o(nlogn)
 * Average Case -> o(nlogn)
 * Best case -> o(n)
 * 
 * It is better than merge sort, and don't use any extra space
 * 
 * @author KISHOR
 *
 */
public class Heap {
	public static void main(String as[]) {
		//int a[] = {31,5,3,50,10,23,15,8};
		int a[] = {4,1,3,2,16,9,10,14,8,7};
		int n = a.length;
		System.out.println("before heapifying");
		printarray(a,n);
		
		createMaxHeap(a,n);
		System.out.println("\nafter heapifying");
		printarray(a,n);
		
		performHeapSort(a,n);
		System.out.println("\nafter heap sort");
		printarray(a,n);
	}

	private static void performHeapSort(int[] a, int n) {
		
		while(n>1) {
			swap(a,1,n);
			heapify(a,1,n-1);
			n--;
		}
		
		
	}

	private static void printarray(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		
	}

	private static void createMaxHeap(int[] a, int n) {
		int start = getParent(n);				
		while(start >= 1) {
			heapify(a,start, n);
			start--;
		}
				
	}

	private static int getParent(int n) {		
		return n/2;
	}

	private static void heapify(int[] a, int start, int end) {
		int left = getLeftChild(start);
		int parent = start;
		
		if(left <= end && a[parent-1] < a[left-1]) {
				parent = left;
		}
		int right = getRightChild(start);
		if(right <= end && a[parent-1] < a[right-1]) {
			parent = right;
		}
		
		if(parent != start) {
			swap(a,start, parent);
			heapify(a, parent, end);
		}
	}

	private static int getRightChild(int start) {		
		return 2*start+1;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i-1];
		a[i-1] = a[j-1];
		a[j-1] = temp;
		
	}

	private static int getLeftChild(int start) {
		return 2*start;
	}
	
	
	

}
