package com.dsa.sl05_Recusrion;

public class Rec9_CheckPallindrome {

	public static void main(String[] args) {
		System.out.println(isPallindrome(121));

	}
	
	static boolean isPallindrome(int n) {
		int reverse = reverse(n);
		return (n == reverse);
	}

	static int reverse(int n) {
		if(n%10 == n) {
			return n;
		}
		int digits = (int) (Math.log10(n)+1);
		return   ((n%10) * (int)Math.pow(10, digits-1))+reverse(n/10);
	}

}
