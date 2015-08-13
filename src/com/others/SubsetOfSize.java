package com.others;

import java.util.ArrayList;

/**
 * write a function that takes two integers, k and n, with 0 ≤ k ≤ n, and prints
 * out all subsets of size k of the integers 1, ..., n, one subset per line. The
 * order of the subsets and the order of elements within the line doesn't
 * matter.
 * 
 * example 1: print_subsets(k=1, n=2); 1 2
 * 
 * example: print_subsets(k=2, n=3); [3 1] [2 3] [1 2]
 * 
 * @author aaqib
 *
 */
public class SubsetOfSize {

	private static int maxCount, len;

	public static void main(String[] args) {
		maxCount = 3;
		len = 2;
		subset(new ArrayList<Integer>(), 1);
	}

	private static void subset(ArrayList<Integer> subset, int num) {
		if (num > maxCount + 1) {
			return;
		}
		if (subset.size() == len) {
			printSet(subset);
			return;
		}
		ArrayList<Integer> temp = new ArrayList<>(subset);
		temp.add(num);
		subset(temp, num + 1);
		subset(subset, num + 1);
	}

	private static void printSet(ArrayList<Integer> subset) {
		for (Integer item : subset) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
