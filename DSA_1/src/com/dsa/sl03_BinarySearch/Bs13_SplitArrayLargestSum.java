package com.dsa.sl03_BinarySearch;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class Bs13_SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] arr = {7,2,5,10,8};
		int k=2;
		System.out.println(splitArrayLS(arr, k));
		//System.out.println(splitArrayBS(arr, k));
	}
	
	static int splitArrayLS(int[] arr, int k) {
        int start = 0;
        int end = 0;
        
        for(int i : arr) {
        	start = Math.max(start, i);
        	end = end + i;
        }
        
        //start = 10
        //end = 32
        
        for(int largestSum = start ; largestSum<=end; largestSum++) {
        	System.out.println("LargestSum="+largestSum);
        	int noOfSubArrays = 1;
        	int sum = 0;
        	for(int j= 0; j<arr.length; j++) {
        		if(sum+arr[j]  > largestSum) {
        			noOfSubArrays++;
        			sum = arr[j];
        			
        		}else {
        			sum = sum+arr[j];
        		}
        		System.out.println("NoOfSubArrays="+noOfSubArrays);
        		
        		System.out.println("Sum="+sum);
        	}
        	if(noOfSubArrays == k) {
        		return largestSum;
        	}
        }
        
        
        return -1;
    }
	
	static int splitArrayBS(int[] arr, int k) {
        int start = 0;
        int end = 0;
        
        for(int i : arr) {
        	start = Math.max(start, i);
        	end = end + i;
        }
        
        //start = 10
        //end = 32
        
        while(start < end ) {
        	int largestSum = start + (end-start)/2;
        	System.out.println("LargestSum="+largestSum);
        	int noOfSubArrays = 1;
        	int sum = 0;
        	for(int j= 0; j<arr.length; j++) {
        		if(sum+arr[j]  > largestSum) {
        			noOfSubArrays++;
        			sum = arr[j];
        			
        		}else {
        			sum = sum+arr[j];
        		}
        		System.out.println("NoOfSubArrays="+noOfSubArrays);
        		
        		System.out.println("Sum="+sum);
        	}
        	if(noOfSubArrays > k) {
        		start = largestSum + 1;
        	}else {
        		end = largestSum;
        	}
        }
        
        
        return end;
    }

}
