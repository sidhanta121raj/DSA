package com.dsa.sl03_BinarySearch;


public class Bs10_TargetSearchInRotatedSortedArrayWithDuplicates {

	public static void main(String[] args) {
		int [] nums = {2, 2, 2, 0, 1, 2, 2, 4, 8, 12, 19};
		System.out.println(searchInRotatedArray(nums, 2));
	}
	
	
	static int searchInRotatedArray(int[] nums, int target) {
   
        int smallestPivotIndex = findPivotIndex(nums);
        int index = binarySearch(nums, target, 0, smallestPivotIndex-1);
        if(index == -1) {
        	index = binarySearch(nums, target, smallestPivotIndex, nums.length-1);
        }
        return index;
    }
	
	static int findPivotIndex(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		
		while(start < end) {
			int mid = start + (end-start)/2;
			if(nums[mid]>nums[end]) {
				start = mid+1;
			}else if(nums[mid]<nums[end]){
				end = mid;
			}else {
				end--;
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
