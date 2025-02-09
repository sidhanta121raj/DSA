package com.dsa.sl5_Recusrion;

public class Rec4_ProductOfN {
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
