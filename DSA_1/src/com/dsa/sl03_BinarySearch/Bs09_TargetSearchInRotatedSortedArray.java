package com.dsa.sl03_BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Bs09_TargetSearchInRotatedSortedArray {

	public static void main(String[] args) {
		int [] nums = {4,5,6,7,0,1,2};
		System.out.println(searchInRotatedArray(nums, 7));
	}
	
	
	static int searchInRotatedArray(int[] nums, int target) {
   
        int smallestPivotIndex = findSmallestPivotIndex(nums);
        int index = binarySearch(nums, target, 0, smallestPivotIndex-1);
        if(index == -1) {
        	index = binarySearch(nums, target, smallestPivotIndex, nums.length-1);
        }
        return index;
    }
	
	static int findSmallestPivotIndex(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			int mid = start + (end-start)/2;
			if(nums[mid]>nums[end]) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		
		return start;
	}

	
	static int binarySearch(int[] arr, int target, int start, int end) {
			
		while(start <= end) {
			int mid = start + (end-start)/2;
			if (target > arr[mid]) {
				start = mid+1;
			}else if (target < arr[mid]) {
				end = mid - 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
