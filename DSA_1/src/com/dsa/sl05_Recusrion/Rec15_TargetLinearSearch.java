package com.dsa.sl05_Recusrion;

import java.util.ArrayList;
import java.util.List;

public class Rec15_TargetLinearSearch {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 18, 9, 18 };
		int target = 18;

		System.out.println(findIfTargetExist(arr, 0, target));
		System.out.println(findIndexOfTarget(arr, 0, target));
		System.out.println(findLastIndexOfTarget(arr, arr.length-1, target));
		findAllIndicesOfTargetWithGlobalList(arr, arr.length-1, target);
		System.out.println(list);
		List<Integer> list = new ArrayList<>();
        List<Integer> ans = findAllIndicesOfTargetWithListAsParam(arr, arr.length-1, target, list);
        System.out.println(ans);
        System.out.println(list);
        
        System.out.println(findAllIndicesOfTargetWithLocalList(arr, arr.length-1, target));
	}

	static boolean findIfTargetExist(int[] arr, int index, int target) {

		if (index == arr.length) {
			return false;
		}

		if (arr[index] == target) {
			return true;
		}
		return findIfTargetExist(arr, ++index, target);
	}

	static int findIndexOfTarget(int[] arr, int index, int target) {

		if (index == arr.length) {
			return -1;
		}

		if (arr[index] == target) {
			return index;
		}
		return findIndexOfTarget(arr, ++index, target);
	}
	
	static int findLastIndexOfTarget(int[] arr, int index, int target) {

		if (index == -1) {
			return -1;
		}

		if (arr[index] == target) {
			return index;
		}
		return findLastIndexOfTarget(arr, --index, target);
	}
	
	static List<Integer> list = new ArrayList<>();
	static void findAllIndicesOfTargetWithGlobalList(int[] arr, int index, int target) {

		if (index == -1) {
			return;
		}

		if (arr[index] == target) {
			list.add(index);
		}
		findAllIndicesOfTargetWithGlobalList(arr, --index, target);
	}
	
	static List<Integer> findAllIndicesOfTargetWithListAsParam(int[] arr, int index, int target, List<Integer> list) {

		if (index == -1) {
			return list;
		}

		if (arr[index] == target) {
			list.add(index);
		}
		return findAllIndicesOfTargetWithListAsParam(arr, --index, target, list);
	}
	
	static List<Integer> findAllIndicesOfTargetWithLocalList(int[] arr, int index, int target) {

		List<Integer> list = new ArrayList<>();
		if (index == -1) {
			return list;
		}

		if (arr[index] == target) {
			list.add(index);
		}
		list.addAll(findAllIndicesOfTargetWithLocalList(arr, --index, target));
		return list;
	}

}
