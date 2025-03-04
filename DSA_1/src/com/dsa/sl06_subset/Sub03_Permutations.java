package com.dsa.sl06_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub03_Permutations {

	public static void main(String[] args) {
		printPermutationsOfAString("abc", "", "main");
		System.out.println(listPermutationsOfAString("abc", ""));
		System.out.println(countPermutationsOfAString("abcd", ""));

	}

	static void printPermutationsOfAString(String ipStr, String opStr, String calledFrom) {
		//System.out.println("calledFrom:" + calledFrom + " ipStr:" + ipStr + " opStr:" + opStr);
		if (ipStr.isEmpty()) {
			System.out.println(opStr);
			return;
		}

		char ch = ipStr.charAt(0);

		for (int i = 0; i <= opStr.length(); i++) {
		//	System.out.println(i);
			printPermutationsOfAString(ipStr.substring(1),
					opStr.substring(0, i) + ch + opStr.substring(i, opStr.length()), i + "th");
		}
	}

	static List<String> listPermutationsOfAString(String ipStr, String opStr) {

		if (ipStr.isEmpty()) {
			return new ArrayList<>(Arrays.asList(opStr));
		}

		List<String> list = new ArrayList<>();
		char ch = ipStr.charAt(0);

		for (int i = 0; i <= opStr.length(); i++) {
			list.addAll(listPermutationsOfAString(ipStr.substring(1),
					opStr.substring(0, i) + ch + opStr.substring(i, opStr.length())));
		}
		return list;
	}
	
	static int countPermutationsOfAString(String ipStr, String opStr) {

		if (ipStr.isEmpty()) {
			return 1;
		}

		int count = 0;
		char ch = ipStr.charAt(0);

		for (int i = 0; i <= opStr.length(); i++) {
			count = count + (countPermutationsOfAString(ipStr.substring(1),
					opStr.substring(0, i) + ch + opStr.substring(i, opStr.length())));
		}
		return count;
	}

}
