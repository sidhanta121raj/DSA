package com.dsa.sl06_subset;

import java.util.ArrayList;
import java.util.List;

public class Sub01_Subsets {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(findSubSets(arr));
	}
	
	static List<List<Integer>> findSubSets(int[] arr){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		results.add(new ArrayList<>());
		
		for(int i: arr) {
			System.out.println("i="+i);
			int n = results.size();
			System.out.println("n="+n);
			for(int j =0; j<n; j++) {
				System.out.println("	j="+j);
				List<Integer> subsets = new ArrayList<Integer>(results.get(j));
				System.out.println("	subsets="+subsets);
				subsets.add(i);
				System.out.println("	subsets="+subsets);
				results.add(subsets);
				System.out.println("	Results="+results);
			}
		}
		return results;
	}

}
