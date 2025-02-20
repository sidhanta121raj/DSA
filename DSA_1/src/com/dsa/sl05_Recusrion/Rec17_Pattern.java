package com.dsa.sl05_Recusrion;

//Print a pattern as below
//* * * *
//* * * 
//* * 
//* 
public class Rec17_Pattern {

	public static void main(String[] args) {
		printPattern(4);
		System.out.println("-------------------------------------");
		printPattern1(4);
		System.out.println("-------------------------------------");
		printPatternRecursively(4, 4);
	}
	
	static void printPattern(int n) {
		for (int i =0; i<n; i++ ) {
			for (int j=0; j<n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void printPattern1(int n) {
		for (int i = n-1; i>=0; i-- ) {
			for (int j=i; j>=0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void printPatternRecursively(int rows, int cols) {
			
			if(cols > 0) {
				System.out.print("* ");
				printPatternRecursively(rows, --cols);
			}else if(rows > 1) {
				System.out.println();
				rows = rows -1;
				cols = rows;
				printPatternRecursively(rows, cols);
			}
		
	}

}
