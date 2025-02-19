package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So04_CyclicSort {

	public static void main(String[] args) {
		int [] arr = {5, 4, 3, 2, 1};
		sortByCyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sortByCyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			if( arr[i] != i+1) {
				swap(arr, i,  arr[i]-1);
			}else {
				i++;
			}
		}
	}
	
	static void swap (int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
