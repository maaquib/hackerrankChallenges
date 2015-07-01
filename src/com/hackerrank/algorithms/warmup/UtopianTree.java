package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < max; i++) {
			Integer terms = scan.nextInt();
			boolean isOdd = true;
			int initHeight = 1;
			if (terms == 0) {
				out.add(initHeight);
			} else {
				while (terms > 0) {
					if (isOdd) {
						initHeight *= 2;
						isOdd = false;
					} else {
						initHeight += 1;
						isOdd = true;
					}
					terms -= 1;
				}
				out.add(initHeight);
			}
		}
		for (Integer outNum : out) {
			System.out.println(outNum);
		}
		scan.close();
	}
}
