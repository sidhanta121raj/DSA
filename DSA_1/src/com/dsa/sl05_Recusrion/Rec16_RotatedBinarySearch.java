package com.dsa.sl05_Recusrion;

public class Rec16_RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 4, 0 , 1, 2, 3};
		System.out.println(searchRecursive(arr, 0, 0, arr.length-1)); 
		System.out.println(searchRecursive(arr, 3, 0, arr.length-1)); 
		System.out.println(searchRecursive(arr, 6, 0, arr.length-1)); 
		System.out.println(searchRecursive(arr, 11, 0, arr.length-1));
		System.out.println(searchRecursive(arr, 21, 0, arr.length-1));

	}

	static int searchRecursive(int[] arr, int target, int sInd, int lInd) {
		if (sInd > lInd) {
			return -1;
		}
		int mInd = sInd + (lInd - sInd) / 2;

		if (arr[mInd] == target) {
			return mInd;
		}

		if (arr[sInd] < arr[mInd]) {
			if (target >= arr[sInd] && target < arr[mInd]) {
				return searchRecursive(arr, target, sInd, mInd - 1);
			} else {
				return searchRecursive(arr, target, mInd, lInd);
			}
		} else {
			if (target > arr[mInd] && target <= arr[lInd]) {
				return searchRecursive(arr, target, mInd + 1, lInd);
			} else {
				return searchRecursive(arr, target, sInd, mInd - 1);
			}
		}
	}
	
	 

}
