package com.dsa.sl02_LinearSearch;

public class Ls2_TargetSearchInString {

	public static void main(String[] args) {
		String str = "Something";
		char target = 'z';
		System.out.println(searchTarget(str, target));
	}
	
	static boolean searchTarget(String str, char target) {
		for(char ch : str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		return false;
	}

}
