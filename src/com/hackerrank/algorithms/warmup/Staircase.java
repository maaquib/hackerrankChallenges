package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stairs = sc.nextInt();
		for (int i = 1; i <= stairs; i++) {
			for (int j = stairs - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("#");
			System.out.printf("\n");
		}
		sc.close();
	}
}
