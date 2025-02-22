package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So12_MergeSortInPlace {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		mergeSort(arr, 0, arr.length, "main");
		System.out.println(Arrays.toString(arr));
	}

	static void mergeSort(int[] arr, int start, int end, String calledFrom) {
		System.out.println("CalledFrom:"+calledFrom+" Array="+Arrays.toString(arr)+" Start="+start+" End="+end);
		if (end - start == 1) {
			return;
		}
		int mid = start + (end - start) / 2;

		mergeSort(arr, start, mid, "1st");
		mergeSort(arr, mid, end, "2nd");
		
		merge(arr, start, mid, end);
	}

	static void merge(int[] arr, int start, int mid, int end) {
		int[] merged = new int[end - start];
		int i = start;
		int j = mid;
		int k = 0;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				merged[k] = arr[i];
				i++;
			} else {
				merged[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i < mid) {
			merged[k] = arr[i];
			i++;
			k++;
		}

		while (j < end) {
			merged[k] = arr[j];
			j++;
			k++;
		}

		for (int l = 0; l < merged.length; l++) {
			arr[start + l] = merged[l];
		}

	}

}
