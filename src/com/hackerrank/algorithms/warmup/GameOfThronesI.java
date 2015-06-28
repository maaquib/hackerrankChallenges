package com.hackerrank.algorithms.warmup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
		String ans = "YES";
		int countOfOdd = 0;
		HashMap<Character, Integer> countChars = new HashMap<Character, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			char character = inputString.charAt(i);
			if (!countChars.containsKey(character)) {
				countChars.put(character, countOfChars(inputString, character));
			}
		}
		Iterator<Entry<Character, Integer>> itr = countChars.entrySet()
				.iterator();
		while (itr.hasNext()) {
			if (itr.next().getValue() % 2 != 0) {
				countOfOdd++;
			}
			if (countOfOdd > 1) {
				ans = "NO";
			}
		}
		System.out.println(ans);
		myScan.close();
	}

	private static Integer countOfChars(String inputString, char character) {
		int count = 0;
		for (char charactr : inputString.toCharArray()) {
			if (charactr == character) {
				count++;
			}
		}
		return count;
	}
}
