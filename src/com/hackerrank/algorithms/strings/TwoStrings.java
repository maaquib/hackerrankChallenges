package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		ArrayList<String> out = new ArrayList<String>();
		for (int i = 0; i < cases; i++) {
			boolean isSub = false;
			String word1 = sc.nextLine();
			String word2 = sc.nextLine();
			boolean[] counter = new boolean[26];
			for (Character ch : word1.toCharArray()) {
				counter[Character.toUpperCase(ch) - 65] = true;
			}
			for (Character ch : word2.toCharArray()) {
				if (counter[Character.toUpperCase(ch) - 65]) {
					isSub = true;
					break;
				}
			}
			if (isSub) {
				out.add("YES");
			} else {
				out.add("NO");
			}
		}
		for (String string : out) {
			System.out.println(string);
		}
		sc.close();
	}
}
