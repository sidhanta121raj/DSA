package com.dsa.sl04_Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/
public class So10_FirstMissingPositive {

	public static void main(String[] args) {
		int [] arr = {3,4,-1,1};
		//int [] arr = {7,8,9,11,12};
		System.out.println(firstMissingPositive(arr));
	}
	
	static int firstMissingPositive(int[] arr) {
		int i=0;
        while(i < arr.length) {
        	if(arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[arr[i]-1]) {
        		swap(arr, i, arr[i]-1);
        	}else {
        		i++;
        	}
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0; j<arr.length; j++) {
        	if(arr[j] != j+1) {
        		return j+1;
        	}
        }
        
        return arr.length+1;
    }
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1]= arr[index2];
		arr[index2]= temp;
	}

}
