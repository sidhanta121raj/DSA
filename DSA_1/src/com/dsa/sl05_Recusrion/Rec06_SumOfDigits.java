package com.dsa.sl05_Recusrion;

public class Rec06_SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(324));
	}

	static int sum(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10+sum(n/10) ;
	}
}
