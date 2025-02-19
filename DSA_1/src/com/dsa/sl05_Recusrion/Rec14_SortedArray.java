package com.dsa.sl05_Recusrion;

public class Rec14_SortedArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 16, 8};
		System.out.println(isSorted(arr, 0));

	}
	
	static boolean isSorted(int[] arr, int start) {
		
		if(start == arr.length-1) {
			return true;
		}
		
		
		if(arr[start]<arr[start+1] && isSorted(arr, start+1)) {
			return true;
		}
		
		return false;
	}

}
