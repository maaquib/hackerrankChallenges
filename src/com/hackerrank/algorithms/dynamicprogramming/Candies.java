package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		long[][] array = new long[testCases][2];
		for (int i = 0; i < testCases; i++) {
			array[i][0] = sc.nextLong();
			array[i][1] = 1;
		}
		if (testCases > 1 && array[0][0] > array[1][0]) {
			array[0][1]++;
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i][0] > array[i - 1][0]) {
				array[i][1] = array[i - 1][1] + 1;
			}
		}
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i - 1][0] > array[i][0]) {
				array[i - 1][1] = Math.max(array[i - 1][1], array[i][1] + 1);
			}
		}
		long sum = 0;
		for (long[] item : array) {
			sum += item[1];
		}
		System.out.println(sum);
		sc.close();
	}
}
