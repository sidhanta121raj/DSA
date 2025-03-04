package com.dsa.sl06_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class Sub04_LetterCombinationOfAPhoneNumber {

	public static void main(String[] args) {
		System.out.println(listLetterCombinationOfAPhoneNumber("", "123"));

	}
	
	static List<String> listLetterCombinationOfAPhoneNumber(String processed, String unProcessed){
		if(unProcessed.isEmpty()) {
			return new ArrayList<String>(Arrays.asList(processed));
		}
		
		List<String> combinations = new ArrayList<>();
		
		int digit = unProcessed.charAt(0) - '0';
		
		for(int i = (digit-1)*3; i< digit*3; i++) {
			char ch = (char) ('a' + i);
			combinations.addAll(listLetterCombinationOfAPhoneNumber(processed+ch, unProcessed.substring(1)));
		}
		
		
		
		return combinations;
	}

}
