package com.dsa.sl01_Array;

public class Arr2_MaxValue {

	public static void main(String[] args) {
		int [] arr = {3, 1, 7, 0, 3, 2};
		System.out.println(findMax(arr));
		System.out.println(findMaxInARange(arr, 2, arr.length-1));
	}

	private static int findMax(int[] arr) {
		if(arr.length == 0) {
			return -1;
		}
		int max = 0;
		for(int i : arr) {
			if(i> max) {
				max = i;
			}
		}
		return max;
	}
	
	private static int findMaxInARange(int[] arr, int start, int end) {
		if(arr.length == 0) {
			return -1;
		}
		if(start> arr.length-1 || end>arr.length-1) {
			return -1;
		}
		int max = 0;
		for(int i=start; i<=end; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
