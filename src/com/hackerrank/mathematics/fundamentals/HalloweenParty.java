package com.hackerrank.mathematics.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<Long> out = new ArrayList<Long>();
		for (int i = 0; i < testCases; i++) {
			long num = sc.nextLong();
			out.add((num / 2) * (num - (num / 2)));
		}
		for (Long max : out) {
			System.out.println(max);
		}
		sc.close();
	}
}
