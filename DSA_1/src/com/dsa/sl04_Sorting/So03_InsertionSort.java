package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So03_InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		sortByInsertionSortAlgo(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sortByInsertionSortAlgo(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j - 1, j);
				}
			}
		}
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
