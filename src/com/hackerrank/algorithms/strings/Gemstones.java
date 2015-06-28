package com.hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<Character>();
		int cases = sc.nextInt();
		sc.nextLine();
		boolean first = true;
		for (int i = 0; i < cases; i++) {
			HashSet<Character> newSet = new HashSet<Character>();
			String word = sc.nextLine();
			for (Character character : word.toCharArray()) {
				if (first) {
					set.add(character);
				} else {
					newSet.add(character);
				}
			}
			if (!first) {
				set.retainAll(newSet);
			}
			first = false;
		}
		System.out.println(set.size());
		sc.close();
	}
}