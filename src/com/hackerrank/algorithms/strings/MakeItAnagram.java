package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> wordArray1 = new ArrayList<Character>(), wordArray2 = new ArrayList<Character>();
		for (Character ch : sc.nextLine().toCharArray()) {
			wordArray1.add(ch);
		}
		for (Character ch : sc.nextLine().toCharArray()) {
			wordArray2.add(ch);
		}
		int sum = wordArray1.size() + wordArray2.size();
		Collections.sort(wordArray1);
		Collections.sort(wordArray2);
		int counter = delRequired(wordArray1, wordArray2);
		System.out.println(Math.abs(sum - counter * 2));
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
