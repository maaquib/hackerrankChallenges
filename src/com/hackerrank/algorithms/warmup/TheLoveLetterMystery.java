package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class TheLoveLetterMystery {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> out = new ArrayList<Integer>();
		int max = scan.nextInt();
		for (int i = 0; i < max; i++) {
			int counts = 0;
			String word = scan.next();
			if (word.length() == 1) {
				out.add(counts);
			} else {
				for (int j = word.length() - 1; j >= 0; j--) {
					if (word.charAt(j) == word.charAt(word.length() - j - 1)) {
					} else if (word.charAt(j) > word.charAt(word.length() - j
							- 1)) {
						counts += word.charAt(j)
								- word.charAt(word.length() - j - 1);
					} else {
						continue;
					}
				}
				out.add(counts);
			}
		}
		for (Integer outNum : out) {
			System.out.println(outNum);
		}
		scan.close();
	}
}
