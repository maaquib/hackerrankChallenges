package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine().trim());
		for (int i = 0; i < cases; i++) {
			char[] lineArray = sc.nextLine().toCharArray();
			nextPermutation(lineArray);
		}
		sc.close();
	}

	/*
	 * http://www.nayuki.io/page/next-lexicographical-permutation-algorithm
	 */
	private static void nextPermutation(char[] array) {
		int i = array.length - 1;
		// Find longest non-increasing suffix
		while (i > 0 && array[i - 1] >= array[i]) {
			i--;
		}
		if (i == 0) {
			System.out.println("no answer");
			return;
		}
		// array[i - 1] is the pivot
		// Find rightmost element greater than the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;

		// Swap the pivot with j
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Suffix reversal
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		System.out.println(String.valueOf(array));
	}
}
