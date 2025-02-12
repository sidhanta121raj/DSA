package com.dsa.sl03_BinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/
public class Bs08_TargetSearchInMountainArray {

	public static void main(String[] args) {
		//int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 172, 173, 179, 180, 201, 205, 209, 301, 305, 10001, 99, 88, 77, 55};
		int[] arr = {0,1,2,4,2,1};
		int target = 3;
		MountainArray mArr = new MountainArray(arr);
		System.out.println(findInMountainArray(target, mArr));
	}
	
	static class MountainArray {
		int [] arr;
		
		MountainArray(int [] arr){
			this.arr = arr;
		}
		public int get(int index) {
			return arr[index];
		}
		public int length() {
			return arr.length;
		}
	}
	
	static int findInMountainArray(int target, MountainArray mountainArr) {
		int peakIndex = findPeak(mountainArr);
		System.out.println("peakIndex="+peakIndex);
		int index = orderAgnosticBinarySearch(mountainArr, 0, peakIndex, target);
		System.out.println("Index="+index);
		if(-1 != index) {
			return index;
		}else {
			index = orderAgnosticBinarySearch(mountainArr, peakIndex, mountainArr.length()-1, target);
			System.out.println("Index="+index);
		}
		return index;   
    }
	
	
	static int findPeak(MountainArray arr) {
		int start = 0;
		int end = arr.length() -1;
		
		while(start < end) {
			int mid = start + (end-start)/2;
			if(arr.get(mid) < arr.get(mid+1)) {
				start = mid+1;
			}else {
				end = mid;
			}
		}
		return start;
	}
	
	static int orderAgnosticBinarySearch(MountainArray arr, int start, int end, int target) {
		boolean isAsc = arr.get(end)>arr.get(start);
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(isAsc) {
				if(target> arr.get(end) || target < arr.get(start)) {
					return -1;
				}
				if(target > arr.get(mid)) {
					start = mid+1;
				}else if(target < arr.get(mid)) {
					end = mid-1;
				}else {
					return mid;
				}
			}else {
				if(target< arr.get(end) || target > arr.get(start)) {
					return -1;
				}
				if(target < arr.get(mid)) {
					start = mid+1;
				}else if(target > arr.get(mid)) {
					end = mid-1;
				}else {
					return mid;
				}
			}
			
		}
		return -1;	
	}

}
