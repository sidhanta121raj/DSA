package com.dsa.sl05_Recusrion;

public class Rec03_SumOfN {

	public static void main(String[] args) {
		System.out.println(sum(10));

	}
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n + sum(n-1);
	}

}
