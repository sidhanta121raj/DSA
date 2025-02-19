package com.dsa.sl05_Recusrion;

public class Rec02_NToOne {
	public static void main(String args []) {
		printNToOne(10);
	}
	
	static void printNToOne(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		printNToOne(--n);
	}

}
