package com.dsa.sl2_LinearSearch;

import java.util.Arrays;

public class Ls6_TargetSearchIn2DArray {

	public static void main(String[] args) {
		 int[][] arr = {
	                {23, 4, 1},
	                {18, 12, 3, 9},
	                {78, 99, 34, 56},
	                {18, 12}
	        };
	        int target = 56;
	        int[] ans = targetSearch(arr,target); 
	        System.out.println(Arrays.toString(ans));

	}
	
	static int[] targetSearch(int [][] arr , int target) {
		for(int rows=0; rows<arr.length; rows++) {
			for(int cols=0; cols< arr[rows].length; cols++) {
				if(arr[rows][cols] == target) {
					return new int[] {rows, cols};
				}
			}
		}
		return new int [] {-1, -1};
	}

}
