package com.dsa.recusrion;

public class OneToN {
	
	public static void main(String[] args) {
		printOneToN(10);
	}
	
	static void printOneToN(int n) {
		if(n==0) {
			return;
		}
		printOneToN(n-1);
		System.out.println(n);
		
	}

}
