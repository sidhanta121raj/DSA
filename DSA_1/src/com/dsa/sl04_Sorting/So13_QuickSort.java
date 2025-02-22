package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So13_QuickSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 7, 9, 5 };
		quickSort(arr, 0, arr.length - 1, "main");
		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int[] arr, int start, int end, String calledFrom) {
		System.out.println(
				"CalledFrom:" + calledFrom + " Array=" + Arrays.toString(arr) + " Start=" + start + " End=" + end);
		if (start >= end) {
			return;
		}

		int i = start;
		int j = end;
		int pivot = start + (end - start) / 2;

		while (i <= j) {
			while (arr[i] < arr[pivot]) {
				i++;
			}
			while (arr[j] > arr[pivot]) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		quickSort(arr, start, j, "1st");
		quickSort(arr, i, end, "2nd");
	}

}
