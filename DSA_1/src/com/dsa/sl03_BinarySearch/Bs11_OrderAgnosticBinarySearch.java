package com.dsa.sl03_BinarySearch;

public class Bs11_OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		 int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 80;
        int ans = orderAgnosticBinarySearch(arr, 0, arr.length-1, target);
        System.out.println(ans);

	}
	
	static int orderAgnosticBinarySearch(int[] arr, int start, int end, int target) {
		boolean isAsc = arr[end]>arr[start];
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(isAsc) {
				if(target> arr[end] || target < arr[start]) {
					return -1;
				}
				if(target > arr[mid]) {
					start = mid+1;
				}else if(target < arr[mid]) {
					end = mid-1;
				}else {
					return mid;
				}
			}else {
				if(target< arr[end] || target > arr[start]) {
					return -1;
				}
				if(target < arr[mid]) {
					start = mid+1;
				}else if(target > arr[mid]) {
					end = mid-1;
				}else {
					return mid;
				}
			}
			
		}
		return -1;	
	}

}
