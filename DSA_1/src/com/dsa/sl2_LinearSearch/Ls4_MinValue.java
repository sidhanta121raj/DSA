package com.dsa.sl2_LinearSearch;

public class Ls4_MinValue {

	public static void main(String[] args) {
		 int[] arr = {18, 12, 7, 3, 14, 28};
	        System.out.println(min(arr));
	}
	
	static int min(int [] arr) {
		int min = arr[0];
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}

}
