package com.dsa.sl02_LinearSearch;

public class Ls7_RichestCustomer {

	public static void main(String[] args) {
		int [][] accounts = {
				{1,5},{7,3},{3,5}
		};
		
		System.out.println(maximumWealth(accounts));

	}
	
	static int maximumWealth(int [][] accounts) {
		int maxWealth = Integer.MIN_VALUE;
		
		for(int[] account : accounts) {
			int totalWealth = 0;
			for(int wealth : account) {
				totalWealth = totalWealth+wealth;
			}
			if(totalWealth > maxWealth) {
				maxWealth = totalWealth;
			}
		}
		return maxWealth;
	}

}
