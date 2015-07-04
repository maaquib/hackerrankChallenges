package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort1 {

	private static int[] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		int[] countArray = new int[100];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		for (int j = 0; j < array.length; j++) {
			countArray[array[j]]++;
		}
		for (int j = 0; j < array.length; j++) {
			System.out.print(countArray[j] + " ");
		}
		sc.close();
	}
}
