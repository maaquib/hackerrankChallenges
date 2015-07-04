package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort3 {

	private static int[] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		int[] countArray = new int[100];
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(sc.nextLine().split("\\s")[0]);
		}
		for (int j = 0; j < array.length; j++) {
			countArray[array[j]]++;
		}
		for (int j = 1; j < countArray.length; j++) {
			countArray[j] += countArray[j - 1];
		}
		for (int j : countArray) {
			System.out.print(j + " ");
		}
		sc.close();
	}
}
