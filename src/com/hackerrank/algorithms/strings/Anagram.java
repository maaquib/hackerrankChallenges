package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i = 0; i < cases; i++) {
			String word = sc.nextLine();
			String part1 = word.substring(0, word.length() / 2);
			String part2 = word.substring(word.length() / 2, word.length());
			if (part1.length() != part2.length()) {
				out.add(-1);
			} else {
				ArrayList<Character> wordArray1 = new ArrayList<Character>(), wordArray2 = new ArrayList<Character>();
				for (Character ch : part1.toCharArray()) {
					wordArray1.add(ch);
				}
				for (Character ch : part2.toCharArray()) {
					wordArray2.add(ch);
				}
				int sum = wordArray1.size() + wordArray2.size();
				Collections.sort(wordArray1);
				Collections.sort(wordArray2);
				out.add(Math.abs(sum - delRequired(wordArray1, wordArray2) * 2) / 2);
			}
		}
		for (Integer integer : out) {
			System.out.println(integer);
		}
		sc.close();
	}

	private static int delRequired(ArrayList<Character> wordArray1,
			ArrayList<Character> wordArray2) {
		int counter = 0;
		if (wordArray1.size() > wordArray2.size()) {
			for (Character character : wordArray2) {
				if (wordArray1.remove(character)) {
					counter++;
				}
			}
		} else {
			for (Character character : wordArray1) {
				if (wordArray2.remove(character)) {
					counter++;
				}
			}
		}
		return counter;
	}
}
