package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So01_BubbleSort {

	public static void main(String[] args) {
		 int[] arr = {5, 4, 3, 2, 1};
		 sortByBubbleSortAlgo(arr);
		 System.out.println(Arrays.toString(arr));
	}
	
	static void sortByBubbleSortAlgo(int[] arr) {
		for(int i=0; i<=arr.length-1; i++) {
			boolean didSwap = false;
			for(int j=1; j<=arr.length-i-1; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr, j-1, j);
					didSwap = true;
				}
			}
			if(!didSwap) {
				break;
			}
		}
	}
	
	 static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }

}
