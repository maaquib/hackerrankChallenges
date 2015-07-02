package com.hackerrank.algorithms.bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<Long> out = new ArrayList<Long>();
		for (int i = 0; i < testCases; i++) {
			long num = sc.nextLong();
			out.add(~num & 0xffffffffL);
		}
		for (Long max : out) {
			System.out.println(max);
		}
		sc.close();
	}
}
