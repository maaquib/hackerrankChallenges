package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<Integer> total = new ArrayList<Integer>();
		for (int i = 0; i < testCases; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			total.add((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
		}
		for (Integer integer : total) {
			System.out.println(integer);
		}
		sc.close();

	}
}
