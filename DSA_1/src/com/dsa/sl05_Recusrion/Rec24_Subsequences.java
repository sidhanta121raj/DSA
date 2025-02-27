package com.dsa.sl05_Recusrion;

public class Rec24_Subsequences {

	public static void main(String[] args) {
		subsequences("", "abc", "main");
	}
	
	static void subsequences(String opStr, String ipStr, String calledFrom) {
		System.out.println("CalledFrom:"+calledFrom+" opStr:"+opStr+" ipStr:"+ipStr);
		if(ipStr.isEmpty()) {
			System.out.println(opStr);
			return;
		}
		
		char ch = ipStr.charAt(0);
		
		subsequences(opStr+ch, ipStr.substring(1), "1st");
		subsequences(opStr, ipStr.substring(1), "2nd");
	}

}
