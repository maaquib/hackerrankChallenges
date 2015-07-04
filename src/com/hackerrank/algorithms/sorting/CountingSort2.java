package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort2 {

	private static int[] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		int[] countArray = new int[100];
		int[] sortedArray = new int[size];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		for (int j = 0; j < array.length; j++) {
			countArray[array[j]]++;
		}
		for (int j = 1; j < countArray.length; j++) {
			countArray[j] += countArray[j - 1];
		}
		for (int j = array.length - 1; j >= 0; j--) {
			sortedArray[countArray[array[j]] - 1] = array[j];
			countArray[array[j]] -= 1;
		}
		for (int j : sortedArray) {
			System.out.print(j + " ");
		}
		sc.close();
	}
}
