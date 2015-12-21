package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class RedJohnIsBack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int N = sc.nextInt();
			int combinations = brickLaying(N);
			int numPrimes = 0;
			for (int j = 2; j <= combinations; j++) {
				if (isPrime(j)) {
					numPrimes++;
				}
			}
			System.out.println(numPrimes);
		}
		sc.close();
	}

	private static boolean isPrime(int num) {
		if (num > 2 && (num & 1) == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	private static int brickLaying(int N) {
		if (N <= 3) {
			return 1;
		}
		int[] table = new int[N + 1];
		table[0] = 1;
		table[1] = 1;
		table[2] = 1;
		table[3] = 1;
		for (int i = 4; i <= N; i++) {
			table[i] = table[i - 1] + table[i - 4];
		}
		return table[N];
	}
}
