package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class MaxXOR {
	/*
	 * Complete the function below.
	 */

	static int maxXor(int l, int r) {
		int temp = 0;
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				if ((i ^ j) > temp) {
					temp = i ^ j;
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _l;
		_l = Integer.parseInt(in.nextLine());
		int _r;
		_r = Integer.parseInt(in.nextLine());
		res = maxXor(_l, _r);
		System.out.println(res);
		in.close();
	}
}
