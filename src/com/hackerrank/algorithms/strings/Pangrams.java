package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] counter = new boolean[26];
		String sentence = sc.nextLine();
		for (Character ch : sentence.toCharArray()) {
			if (Character.toUpperCase(ch) >= 65
					&& Character.toUpperCase(ch) <= 90) {
				counter[Character.toUpperCase(ch) - 65] = true;
			}
		}
		for (boolean b : counter) {
			if (!b) {
				System.out.println("not pangram");
				sc.close();
				return;
			}
		}
		System.out.println("pangram");
		sc.close();
	}
}
