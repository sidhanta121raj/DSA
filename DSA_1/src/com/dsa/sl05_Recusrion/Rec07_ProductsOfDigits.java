package com.dsa.sl05_Recusrion;


public class Rec07_ProductsOfDigits {

	public static void main(String[] args) {
		System.out.println(productsOfDigits(273));

	}

	private static int productsOfDigits(int n) {
		if(n%10 == n) {
			return n;
		}
		return n%10 * productsOfDigits(n/10);
	}

}
