package com.dsa.sl03_BinarySearch;


public class Bs06_TargetSearchInInfiniteArray {

	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 172, 173, 179, 180, 201, 205, 209, 301, 305, 10001, 555551};
		int target = 3;
		System.out.println(findInInfiniteArray(arr, target));

	}

	static int findInInfiniteArray(int[] arr, int target) {
		int start = 2;
		int end = 2;
		
		
		while(start <= end) {
			if (target> arr[end]) {
				start = end +1;
				end = end + 2*end;
			}else {
				int mid = start + (end-start)/2;
				if(target < arr[mid]) {
					end = mid - 1;
				}else if(target > arr[mid]) {
					start = mid + 1;
				}else {
					return mid;
				}
			}
		}
		return -1;
	}

}
