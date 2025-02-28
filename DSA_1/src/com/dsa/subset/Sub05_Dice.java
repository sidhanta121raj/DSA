package com.dsa.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub05_Dice {

	public static void main(String[] args) {
		System.out.println(dice("", 6));

	}
	
	static List<String> dice(String p, int target){
		if(target == 0){
			return new ArrayList<String>(Arrays.asList(p));
		}
		
		List<String> list = new ArrayList<String>();
		
		for(int i=1; i<=6 && i<= target; i++) {
			list.addAll(dice(p+i, target-i));
		}
		
		return list;
	}

}
