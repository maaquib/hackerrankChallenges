package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class TheCoinChangeProblem {

	private static int[] coins;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line1 = sc.nextLine().split("\\s+");
		int sum = Integer.parseInt(line1[0]);
		int numOfCoins = Integer.parseInt(line1[1]);
		String[] line2 = sc.nextLine().split("\\s+");
		coins = new int[line2.length];
		for (int i = 0; i < numOfCoins; i++) {
			coins[i] = Integer.parseInt(line2[i]);
		}
		System.out.println(validCombosCount(coins, coins.length, sum));
		sc.close();
	}

	private static long validCombosCount(int[] coins, int len, int sum) {
		long[][] table = new long[sum + 1][len];
		for (int i = 0; i < len; i++) {
			table[0][i] = 1;
		}

		for (int i = 1; i < sum + 1; i++) {
			for (int j = 0; j < len; j++) {
				long x = (i >= coins[j]) ? (long) table[i - coins[j]][j] : 0;
				long y = (j >= 1) ? (long) table[i][j - 1] : 0;
				table[i][j] = x + y;
			}
		}
		return table[sum][len - 1];
	}
}