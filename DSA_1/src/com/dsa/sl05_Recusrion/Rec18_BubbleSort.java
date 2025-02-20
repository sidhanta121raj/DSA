package com.dsa.sl05_Recusrion;

import java.util.Arrays;

public class Rec18_BubbleSort {

	public static void main(String[] args) {
		int [] arr = {5, 4, 3, 2, 1};
		sort(arr, arr.length, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	static void sort(int[] arr, int i, int j){
		System.out.println("Array="+Arrays.toString(arr)+" i="+i+" j="+j);			
		if(j > arr.length-i+1) {
			if(arr[j-1] < arr[j-2]) {
				swap(arr, j-1, j-2);
			}
			sort(arr, i, --j);
		}else if(i > 1) {
			i = i -1;
			j = arr.length;
			sort(arr, i, j);
		}
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
