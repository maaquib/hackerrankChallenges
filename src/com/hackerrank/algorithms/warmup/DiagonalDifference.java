package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dim = sc.nextInt();
		int sumRight = 0, sumLeft = 0;
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				int temp = sc.nextInt();
				if (i == j) {
					sumLeft += temp;
				}
				if (i + j == dim - 1) {
					sumRight += temp;
				}
			}
		}
		System.out.println(Math.abs(sumLeft - sumRight));
		sc.close();
	}
}
