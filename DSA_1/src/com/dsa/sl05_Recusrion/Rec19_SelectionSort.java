package com.dsa.sl05_Recusrion;

import java.util.Arrays;

public class Rec19_SelectionSort {

	public static void main(String[] args) {
		int [] arr = {5, 4, 3, 2, 1};
		sort(arr, arr.length-1, arr.length-1, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	static void sort(int[] arr, int i, int j, int max){
		System.out.println("Array="+Arrays.toString(arr)+" i="+i+" j="+j+" max="+max);			
		if(j >= arr.length-i) {
			if(arr[j-1] > arr[max]) {
				max = j-1;
			}
			sort(arr, i, --j, max);
		}else if(i > 1) {
			swap(arr, i, max);
			i = i -1;
			j = i;
			max = i;
			sort(arr, i, j, max);
		}
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
