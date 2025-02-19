package com.dsa.sl04_Sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class So08_AllDuplicateFinding {

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));

	}
	
	static List<Integer> findDuplicates(int[] arr) {
		List<Integer> allMissingNos = new ArrayList<>();
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
				allMissingNos.add(arr[j]);
			}
		}
		return allMissingNos;
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
