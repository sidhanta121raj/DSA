package com.dsa.sl04_Sorting;

//https://leetcode.com/problems/set-mismatch/description/
public class So09_SetMismatch {

	public static void main(String[] args) {
		int arr[] = {1,2,2,4};
		System.out.println(findErrorNums(arr));

	}
	
	static int[] findErrorNums(int[] arr) {
		
		int i = 0;
		while(i<arr.length) {
			if(arr[i] != arr [arr[i]-1]) {
				swap(arr, i, arr[i]-1);
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] != j+1) {
				return new int[] {arr[j], j+1};
			}
		}
		return new int[] {-1, -1};
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
