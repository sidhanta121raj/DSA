package com.dsa.sl01_Array;

import java.util.Arrays;

public class Arr1_ElementSwap {

	public static void main(String[] args) {
		int [] arr = {3, 6, 1, 9, 12};
		swap(arr, 1, 4);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(Arrays.toString(arr));
	}

}
