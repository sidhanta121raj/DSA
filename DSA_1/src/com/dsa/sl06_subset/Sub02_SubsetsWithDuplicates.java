package com.dsa.sl06_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub02_SubsetsWithDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
		System.out.println(findSubSets(arr));
	}
	
	static List<List<Integer>> findSubSets(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		results.add(new ArrayList<>());
		int start = 0;
		int end = 0;
		for(int i = 0; i< arr.length; i++) {
			start = 0;
			if(i>0 && arr[i]==arr[i-1]) {
				start = end + 1;
			}
			end = results.size()-1;
			
			System.out.println("i="+i);
			int n = results.size();
			System.out.println("n="+n);
			for(int j = start; j<n; j++) {
				System.out.println("	j="+j);
				List<Integer> subsets = new ArrayList<Integer>(results.get(j));
				System.out.println("		subsets="+subsets);
				subsets.add(arr[i]);
				System.out.println("		subsets="+subsets);
				results.add(subsets);
				System.out.println("		Results="+results);
			}
		}
		return results;
	}

}
