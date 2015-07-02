package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<ArrayList<Long>> out = new ArrayList<ArrayList<Long>>();
		for (int i = 0; i < testCases; i++) {
			ArrayList<Long> list = new ArrayList<Long>();
			int n = sc.nextInt();
			long a = sc.nextInt();
			long b = sc.nextInt();
			for (int j = 0; j < n; j++) {
				long num = b * j + a * (n - 1 - j);
				if (!list.contains(num)) {
					list.add(num);
				}
			}
			java.util.Collections.sort(list);
			out.add(list);
		}
		for (ArrayList<Long> list : out) {
			for (Long integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
