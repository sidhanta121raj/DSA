package com.dsa.sl05_Recusrion;

public class Rec10_NoOfZeros {

	public static void main(String[] args) {
		System.out.println(countZeros(50012300));

	}
	
	static int countZeros(int n) {
		
		return count(n, 0);
	}
	
	static int count(int n, int count) {
		if(n == 0) {
			return count;
		}
		if(n%10 == 0 ) {
			return count(n/10, count+1);
		}
		return count(n/10, count);
	}	
	
	

}
