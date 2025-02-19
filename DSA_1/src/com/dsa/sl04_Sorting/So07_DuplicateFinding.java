package com.dsa.sl04_Sorting;

//https://leetcode.com/problems/find-the-duplicate-number/description/
public class So07_DuplicateFinding {

	public static void main(String[] args) {
		int arr[] = {1,3,4,2,2};
		System.out.println(findDuplicate(arr));

	}
	
	static int findDuplicate(int[] arr) {
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
				return arr[j];
			}
		}
		return arr[arr.length-1];
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
