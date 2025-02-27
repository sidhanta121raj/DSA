package com.dsa.sl05_Recusrion;

import java.util.ArrayList;
import java.util.Arrays;

public class Rec24_Subsequences {

	public static void main(String[] args) {
		subsequences("", "abc", "main");
		System.out.println(subsequencesList("abc", ""));
	}
	
	static void subsequences(String opStr, String ipStr, String calledFrom) {
		//System.out.println("CalledFrom:"+calledFrom+" opStr:"+opStr+" ipStr:"+ipStr);
		if(ipStr.isEmpty()) {
			System.out.println(opStr);
			return;
		}
		
		char ch = ipStr.charAt(0);
		
		subsequences(opStr+ch, ipStr.substring(1), "1st");
		subsequences(opStr, ipStr.substring(1), "2nd");
	}
	
	static ArrayList<String> subsequencesList(String ipStr, String opStr){
		
		if(ipStr.isEmpty()) {
			return new ArrayList<String>(Arrays.asList(opStr));
		}
		char ch = ipStr.charAt(0);
		
		ArrayList<String> left = subsequencesList(ipStr.substring(1), opStr+ch);
		ArrayList<String> right =  subsequencesList(ipStr.substring(1), opStr);
		
		left.addAll(right);
		return left;
	}

}
