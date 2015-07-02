package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int zero = 0, pos = 0, neg = 0;
		for (int i = 0; i < cases; i++) {
			int temp = sc.nextInt();
			if (temp > 0) {
				pos += 1;
			} else if (temp < 0) {
				neg += 1;
			} else {
				zero += 1;
			}
		}
		System.out.println(String.format("%.3f", (float) pos / cases));
		System.out.println(String.format("%.3f", (float) neg / cases));
		System.out.println(String.format("%.3f", (float) zero / cases));
		sc.close();
	}
}
