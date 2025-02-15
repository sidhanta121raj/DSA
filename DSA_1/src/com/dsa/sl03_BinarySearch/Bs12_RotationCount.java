package com.dsa.sl03_BinarySearch;

public class Bs12_RotationCount {

	public static void main(String[] args) {
		int [] arr= {4, 5, 6, 7, 0, 1, 2};
		System.out.println("LeftToRightRotations:"+countLeftToRightRotations(arr));
		System.out.println("RightToLeftRotations:"+countRightToLeftRotations(arr));
		
	}
	
	static int countLeftToRightRotations(int[] arr) {
		int pivotIndex = findPivot(arr);
		System.out.println("pivotIndex:"+pivotIndex);
		return --pivotIndex;
	}
	
	static int countRightToLeftRotations(int[] arr) {
		int pivotIndex = findPivot(arr);
		System.out.println("pivotIndex:"+pivotIndex);
		return pivotIndex;
	}
	
	static int findPivot(int[] arr){
		int start = 0; 
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid] > arr[end]) {
				start = mid + 1;
			}else {
				end = mid;
			}
		}
		return start;
	}

}
