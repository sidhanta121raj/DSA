package com.dsa.subset;

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
			int n = results.size();
			for(int j =0; j<n; j++) {
				List<Integer> subsets = new ArrayList<Integer>(results.get(j));
				subsets.add(i);
				results.add(subsets);
			}
		}
		return results;
	}

}
