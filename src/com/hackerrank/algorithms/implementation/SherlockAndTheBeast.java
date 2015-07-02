package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<char[]> out = new ArrayList<char[]>();
		for (int i = 0; i < testCases; i++) {
			int val = sc.nextInt();
			char[] num = { '-', '1' };
			int fives = checkDecent(val);
			if (fives != -1) {
				num = new char[val];
				if (fives == val) {
					Arrays.fill(num, '5');
				} else if (fives == 0) {
					Arrays.fill(num, '3');
				} else {
					Arrays.fill(num, 0, fives, '5');
					Arrays.fill(num, fives, val, '3');
				}
			}
			out.add(num);
		}
		for (char[] chars : out) {
			System.out.println(String.valueOf(chars));
		}
		sc.close();
	}

	private static int checkDecent(int val) {
		int fives = (val / 3) * 3;
		int threes = val - fives;
		while (fives >= 0 && threes >= 0) {
			if (fives % 3 == 0 && threes % 5 == 0) {
				return fives;
			} else {
				fives -= 3;
				threes += 3;
			}
		}
		return -1;
	}
}
