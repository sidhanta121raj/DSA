package com.dsa.sl05_Recusrion;

public class Rec04_ProductOfN {
	public static void main(String[] args) {
		System.out.println(productOfNtoOne(-1));
	}

	private static int productOfNtoOne(int n) {
		if(n<=1) {
			return n;
		}
		return n * productOfNtoOne(n-1);
	}
}
