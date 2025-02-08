package com.dsa.recusrion;

public class Rec12_BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        System.out.println(search(arr, target, 0, arr.length - 1));

	}

	 static int search(int[] arr, int target, int i, int j) {
		 if(i>j) {
			return -1; 
		 }
		int mid = i+ (j-i)/2;
		if(target == arr[mid]) {
			return mid;
		}
		if(target>arr[mid]) {
			i = mid+1;
		}else {
			j = mid-1;
		}
		return search(arr, target, i, j);
	}

}
