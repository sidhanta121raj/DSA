package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So02_SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		sortBySelectionSortAlgo(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sortBySelectionSortAlgo(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length-i-1;
			int maxIndex = getMaxIndex(arr, last);
			
			swap(arr, maxIndex, last);
		}

	}
	
	static int getMaxIndex(int [] arr, int end) {
		int max = 0;
		for (int j = 0; j <= end; j++) {
			if (arr[j] > arr[max]) { 
				max = j;
			}
		}
		return max;
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
