package com.dsa.sl03_BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/submissions/1540089679/
public class Bs06_InfiniteArraySearch {

	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 172, 173, 179, 180, 201, 205, 209, 301, 305, 10001, 99, 88, 77, 55};
		
		System.out.println(findPeak(arr));

	}

	static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		
		while(start < end) {
			int mid = start + (end-start)/2;
			if(arr[mid+1] < arr[mid]) {
				end = mid;
			}else if(arr[mid+1] > arr[mid]) {
				start = mid + 1;
			}
		
		}
		return arr[start];
	}

}
