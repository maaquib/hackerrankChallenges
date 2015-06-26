package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> out = new ArrayList<String>();
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String word = sc.nextLine();
			boolean funny = true;
			for (int j = 0; j < word.length() - 1; j++) {
				if (!(Math.abs(word.toCharArray()[j + 1]
						- word.toCharArray()[j]) == Math.abs(new StringBuilder(
						word).reverse().toString().toCharArray()[j + 1]
						- new StringBuilder(word).reverse().toString()
								.toCharArray()[j]))) {
					funny = false;
				}
			}
			if (funny) {
				out.add("Funny");
			} else {
				out.add("Not Funny");
			}
		}
		for (String string : out) {
			System.out.println(string);
		}
		sc.close();
	}
}
