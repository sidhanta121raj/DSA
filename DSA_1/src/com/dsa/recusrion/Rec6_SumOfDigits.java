package com.dsa.recusrion;

public class Rec6_SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(582));
	}

	static int sum(int n) {
		if(n%10==0) {
			return n;
		}
		return n%10+sum(n/10) ;
	}
}
