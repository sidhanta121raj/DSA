package com.dsa.recusrion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class Rec11_NoOfSteps {

	public static void main(String[] args) {
		System.out.println(calculateSteps(10));

	}
	static int calculateSteps(int n) {
		return noOfSteps(n, 0);
	}
	static int noOfSteps(int n, int steps) {
		if(n == 0) {
			return steps;
		}
		if(n%2 ==0) {
			n = n/2;
		}else if(n%2 !=0) {
			n = n-1;
		}
		steps++;
		return noOfSteps(n, steps);
	}

}
