package com.others;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationQM {
	private static ArrayList<String> result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		result = new ArrayList<>();
		combinations(str, 0);
		for (String string : result) {
			System.out.println(string);
		}
		sc.close();
	}

	private static void combinations(String newString, int pos) {
		if (newString.length() == pos) {
			result.add(newString);
			return;
		}
		if (newString.charAt(pos) == '?') {
			combinations(setNum(newString, pos, '1'), pos + 1);
			combinations(setNum(newString, pos, '0'), pos + 1);
		} else {
			combinations(newString, pos + 1);
		}
	}

	private static String setNum(String originalStr, int pos, char num) {
		StringBuilder newString = new StringBuilder(originalStr);
		newString.setCharAt(pos, num);
		return newString.toString();
	}
}
