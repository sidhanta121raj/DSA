package com.dsa.sl03_BinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Bs05_FirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		int [] arr = {5, 7, 7, 8, 8, 10};
		int target = 8;
		int [] res = findFirstAndLastPositionOfElementInSortedArray( arr, target);
		System.out.println(Arrays.toString(res));

	}
	
	static int[] findFirstAndLastPositionOfElementInSortedArray(int [] arr, int target) {
		int [] res = {-1, -1};
		res[0] = findPositionOfElement(arr, target, true);
		res[1] = findPositionOfElement(arr, target, false);
		return res;
	}
	
	static int findPositionOfElement(int [] arr, int target, boolean isFirst) {
		int start = 0; 
		int end = arr.length-1;
		
		int pos = -1;
		
		while(start <= end ) {
			int mid = start + (end-start)/2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid] ) {
				start = mid + 1;
			}else {
				pos = mid;
				if(isFirst) {
					end = mid -1;
				}else {
					start = mid + 1;
				}
			}
		}
		
		
		return pos;
	}

}
