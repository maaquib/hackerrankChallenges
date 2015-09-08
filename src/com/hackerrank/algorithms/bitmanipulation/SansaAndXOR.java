package com.hackerrank.algorithms.bitmanipulation;

import java.util.Scanner;

public class SansaAndXOR {
	/**
	 * If length of array is even, all numbers would be repeated even number of
	 * times. Hence result = 0
	 * 
	 * If length of array is odd, only the even indexed numbers will be repeated
	 * odd number of times
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int count = sc.nextInt();
			int result = 0;
			for (int j = 0; j < count; j++) {
				int num = sc.nextInt();
				if (j % 2 == 0) {
					result ^= num;
				}
			}
			System.out.println(count % 2 == 0 ? 0 : result);
		}
		sc.close();
	}

}
