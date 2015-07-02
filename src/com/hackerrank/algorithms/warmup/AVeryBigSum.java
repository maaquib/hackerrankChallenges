package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < cases; i++) {
			sum += sc.nextLong();
		}
		System.out.println(sum);
		sc.close();
	}
}
