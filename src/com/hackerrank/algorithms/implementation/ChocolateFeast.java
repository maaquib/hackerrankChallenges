package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < testCases; i++) {
			int money = sc.nextInt();
			int cost = sc.nextInt();
			int wrapReq = sc.nextInt();
			total = 0;
			result.add((money / cost) + calculateChocs(money / cost, wrapReq));
		}
		for (Integer integer : result) {
			System.out.println(integer);
		}
		sc.close();
	}

	private static int total = 0;

	private static int calculateChocs(int wrapper, int wrapReq) {
		if (wrapReq > wrapper) {
			return 0;
		} else {
			total += (wrapper / wrapReq)
					+ calculateChocs(wrapper / wrapReq + wrapper % wrapReq,
							wrapReq);
			return total;
		}
	}
}
