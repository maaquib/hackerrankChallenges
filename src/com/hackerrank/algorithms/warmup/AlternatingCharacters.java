package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> out = new ArrayList<Integer>();
		int max = scan.nextInt();
		for (int i = 0; i < max; i++) {
			String word = scan.next();
			char initChar = word.charAt(0);
			int counts = 0;
			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j) == initChar) {
					counts++;
				} else {
					initChar = word.charAt(j);
				}
			}
			out.add(counts);
		}
		for (Integer outNum : out) {
			System.out.println(outNum);
		}
		scan.close();
	}
}
