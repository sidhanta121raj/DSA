package com.dsa.sl05_Recusrion;

public class Rec23_StringSkip {

	public static void main(String[] args) {

		skipCharacter("baccad", "");
		System.out.println(skipCharacterAndReturn("baccad"));
		System.out.println(skipStringAndReturn("bacapplecdah", "apple"));
		System.out.println(skipStringWhenNotInStringAndReturn("bacapplcdah", "app", "apple"));
	}
	
	static void skipCharacter(String ipStr, String opStr) {
		if(ipStr.isEmpty()) {
			System.out.println(opStr);
			return;
		}
		
		char ch = ipStr.charAt(0);
		
		if(ch == 'a') {
			skipCharacter(ipStr.substring(1), opStr);
		}else {
			skipCharacter(ipStr.substring(1), opStr+ch);
		}
	}
	
	static String skipCharacterAndReturn(String ipStr) {
		if(ipStr.isEmpty()) {
			return "";
		}

		char ch = ipStr.charAt(0);
		
		if(ch == 'a') {
			return skipCharacterAndReturn(ipStr.substring(1));
		}else {
			
			return ch + skipCharacterAndReturn(ipStr.substring(1));
		}
	}
	
	static String skipStringAndReturn(String ipStr, String skipString) {
		if(ipStr.isEmpty()) {
			return "";
		}

		if(ipStr.startsWith(skipString)) {
			return skipStringAndReturn(ipStr.substring(skipString.length()), skipString);
		}else {
			return ipStr.charAt(0) + skipStringAndReturn(ipStr.substring(1), skipString);
		}
	}
	
	static String skipStringWhenNotInStringAndReturn(String ipStr, String skipString, String notInString) {
		if(ipStr.isEmpty()) {
			return "";
		}

		if(ipStr.startsWith(skipString) && !ipStr.startsWith(notInString)) {
			return skipStringWhenNotInStringAndReturn(ipStr.substring(skipString.length()), skipString, notInString);
		}else {
			return ipStr.charAt(0) + skipStringWhenNotInStringAndReturn(ipStr.substring(1), skipString, notInString);
		}
	}


}
