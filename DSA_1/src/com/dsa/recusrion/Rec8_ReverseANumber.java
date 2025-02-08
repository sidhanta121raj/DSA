package com.dsa.recusrion;

public class Rec8_ReverseANumber {

	public static void main(String[] args) {
		reverse1(3720);
		System.out.println(sum);
		System.out.println(reverse2(3720));
	}
	
	static int sum = 0;
	private static void reverse1(int n) {
		if(n==0) {
			return;
		}
		int rem = n%10;
		sum = (sum * 10) + rem;
		reverse1(n/10);
	}
	
	private static int reverse2(int n) {
		if(n%10==n) {
			return n;
		}
		int digits = (int) (Math.log10(n)+1);
		return (n%10 * (int) (Math.pow(10, digits-1)) + reverse2(n/10));
	}

}
