package com.dsa.sl5_Recusrion;

public class Rec5_Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		return n * fact(n-1);
	}
}