package com.dsa.sl05_Recusrion;

public class Rec01_OneToN {
	
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
