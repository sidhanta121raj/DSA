package com.dsa.sl04_Sorting;

import java.util.Arrays;

public class So11_MergeSort {

	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(mergeSort(arr)));

	}
	
	static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int mid =  arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	
	static int[] merge(int[] left, int[] right) {
		
		int[] merged = new int[left.length+right.length];
		int i=0, j=0, k=0;
		while( i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				merged[k] = left[i];
				i++;
			}else {
				merged[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			merged[k]=left[i];
			i++;
			k++;
		}

		while(j<right.length) {
			merged[k]=right[j];
			j++;
			k++;
		}
		return merged;
	}

}
