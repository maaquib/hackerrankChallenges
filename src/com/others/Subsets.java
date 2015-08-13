package com.others;

import java.util.ArrayList;

/**
 * All possible subsets (including null) of a given set
 * 
 * @author aaqib
 *
 */
public class Subsets {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		for (ArrayList<Integer> list : subsets(array)) {
			System.out.print("[");
			for (Integer integer : list) {
				System.out.print(integer + ", ");
			}
			System.out.println("]");
		}
	}

	private static ArrayList<ArrayList<Integer>> subsets(int[] set) {
		if (set.length == 0) {
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < set.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> arrayList : result) {
				temp.add(new ArrayList<>(arrayList));
			}

			for (ArrayList<Integer> arrayList : temp) {
				arrayList.add(set[i]);
			}

			ArrayList<Integer> single = new ArrayList<>();
			single.add(set[i]);
			temp.add(single);

			result.addAll(temp);
		}
		result.add(new ArrayList<>());
		return result;
	}

}
