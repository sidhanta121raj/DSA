package com.dsa.sl05_Recusrion;

public class Rec08_ReverseANumber {

	public static void main(String[] args) {
		reverseThroughExtraVariable(372);
		System.out.println(reversedNo);
		System.out.println(reverseWithoutExtraVariable(372));
	}
	
	static int reversedNo = 0;
	private static void reverseThroughExtraVariable(int n) {
		if(n==0) {
			return;
		}
		int reminder = n%10;
		reversedNo = (reversedNo * 10) + reminder;
		reverseThroughExtraVariable(n/10);
	}
	
	private static int reverseWithoutExtraVariable(int n) {
		if(n%10==n) {
			return n;
		}
		int noOfDigitsInN = (int) (Math.log10(n)+1);
		int reminder = n%10;
		
		return (reminder * (int) (Math.pow(10, noOfDigitsInN-1)) + reverseWithoutExtraVariable(n/10));
	}

}
