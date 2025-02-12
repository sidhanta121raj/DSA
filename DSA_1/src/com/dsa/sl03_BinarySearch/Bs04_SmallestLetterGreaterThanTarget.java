package com.dsa.sl03_BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Bs04_SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		//char[] arr = {'c', 'f', 'j'};
		char[] arr = {'x', 'x', 'y', 'y'};
		char target = 'y';
		
		System.out.println(findNextGreatestChar(arr, target));
		
	}
	
	static char findNextGreatestChar(char[] arr, char target){
		int start = 0;
		int end = arr.length-1;
		
		if(target > arr[end]) {
			return arr[0];
		}
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return arr[start % arr.length];
	}

}
