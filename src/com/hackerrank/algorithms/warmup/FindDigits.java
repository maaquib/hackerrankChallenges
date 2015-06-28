package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < max; i++) {
			double origNum = scan.nextDouble();
			double num = origNum;
			int times = 0;
			while (num / 10 > 0) {
				if (num % 10 == 0) {
				} else {
					if (origNum % (Math.floor(num) % 10) == 0) {
						times++;
					}
				}
				num /= 10;
			}
			out.add(times);
		}
		for (Integer outNum : out) {
			System.out.println(outNum);
		}
		scan.close();
	}
}
