package com.hackerrank.algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int length = sc.nextInt();
			boolean indexExists = false;
			long sum = 0;
			long[] inputArray = new long[length];
			for (int j = 0; j < length; j++) {
				inputArray[j] = sc.nextLong();
				sum += inputArray[j];
			}
			long tempSum = inputArray[0];
			for (int j = 1; j < inputArray.length; j++) {
				if (tempSum == sum - tempSum - inputArray[j]) {
					indexExists = true;
					break;
				} else {
					tempSum += inputArray[j];
				}
			}
			System.out.println(indexExists || length == 1 ? "YES" : "NO");
		}
		sc.close();
	}
}
