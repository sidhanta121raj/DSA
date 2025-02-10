package com.dsa.sl2_LinearSearch;

public class Ls3_TargetSearchInArrayWithinARange {

	public static void main(String[] args) {
		int [] arr = {8, 12, 3, 1, 9, 18, 0 , 5};
		int target = 3;
		
		System.out.println(searchTarget(arr, target, 0, 5));

	}
	
	static int searchTarget(int[] arr, int target, int start, int end) {
		for(int i=start; i<=end; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	

}
