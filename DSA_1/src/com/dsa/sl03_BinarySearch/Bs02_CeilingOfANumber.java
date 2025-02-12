package com.dsa.sl03_BinarySearch;

public class Bs02_CeilingOfANumber {

	public static void main(String[] args) {
		int [] arr = {2, 3, 5, 9, 14, 16, 18};
		System.out.println(findCeiling(arr, 15));
	}
	
	static int findCeiling(int [] arr, int target) {
		int start = 0, end = arr.length-1;
		if(target > arr[end]) {
			return -1;
		}
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		
		return start;
	}

}
