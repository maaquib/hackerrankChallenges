package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class StockMaximize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int j = 0; j < cases; j++) {
			int days = sc.nextInt();
			long[] prices = new long[days];
			for (int i = 0; i < prices.length; i++) {
				prices[i] = sc.nextLong();
			}
			long[] maximum = new long[days];
			maximum[days - 1] = prices[days - 1];
			for (int i = maximum.length - 2; i >= 0; i--) {
				maximum[i] = Math.max(maximum[i + 1], prices[i]);
			}
			long profit = 0L;
			for (int i = 0; i < maximum.length; i++) {
				profit += maximum[i] - prices[i];
			}
			System.out.println(profit);
		}
		sc.close();
	}
}
