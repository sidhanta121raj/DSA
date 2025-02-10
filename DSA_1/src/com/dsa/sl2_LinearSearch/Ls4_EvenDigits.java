package com.dsa.sl2_LinearSearch;

public class Ls4_EvenDigits {

	public static void main(String[] args) {
		 int[] nums = {12,345,2,6,7896};
		 System.out.println(findNumbersWithEvenDigits(nums));
	}
	
	static int findNumbersWithEvenDigits(int [] nums) {
		int count = 0;
		for(int num : nums) {
			if(hasEvenDigits(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean hasEvenDigits(int num) {
		int numberOfDigits = findNumberOfDigits(num);
		return (numberOfDigits%2 == 0 );		
	}
	
	static int findNumberOfDigits(int num) {
		int noOfDigits = 0;
		if(num <0) {
			num = num * -1;
		}
		
		if (num == 0) {
			return 1;
		}
		
		while(num > 0 ) {
			noOfDigits++;
			num = num/10;	
		}
		return noOfDigits;
	}

}
