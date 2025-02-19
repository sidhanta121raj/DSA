package com.dsa.sl04_Sorting;

//https://leetcode.com/problems/missing-number/submissions/1548069102/
public class So05_MissingNumber {

	public static void main(String[] args) {
		int arr[] = {3,0,1};
		System.out.println(findMissingNumber(arr));

	}
	
	static int findMissingNumber(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i]<arr.length && arr[i] != i) {
				swap(arr, i, arr[i]);
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j] !=j) {
				return j;
			}
		}
		return arr.length;
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
