package com.dsa.sl01_Array;

import java.util.Arrays;

public class Arr3_Reverse {

	public static void main(String[] args) {
		int[] arr = {2, 1, 6, 1, 1, 9, 3};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp; 	
	}

}
