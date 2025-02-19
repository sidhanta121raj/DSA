package com.dsa.sl05_Recusrion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class Rec11_NoOfSteps {

	public static void main(String[] args) {
		System.out.println(calculateSteps(10));

	}
	static int calculateSteps(int num) {
		return noOfSteps(num, 0);
	}
	static int noOfSteps(int num, int steps) {
		if(num == 0) {
			return steps;
		}
		if(num%2 ==0) {
			num = num/2;
		}else if(num%2 !=0) {
			num = num-1;
		}
		steps++;
		return noOfSteps(num, steps);
	}

}
