package com.dsa.sl2_LinearSearch;

public class Ls1_TargetSearchInArray {

	public static void main(String[] args) {
		int [] arr = {8, 12, 3, 1, 9, 18, 0 , 5};
		int target = 3;
		
		System.out.println(searchTarget(arr, target));

	}
	
	static int searchTarget(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	

}
