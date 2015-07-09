package com.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine().trim());
		for (int i = 0; i < cases; i++) {
			int anagrams = 0;
			HashMap<String, Integer> map = new HashMap<>();
			String line = sc.nextLine().trim();
			for (int j1 = 0; j1 < line.length(); j1++) {
				for (int j2 = j1 + 1; j2 <= line.length(); j2++) {
					char[] sub = line.substring(j1, j2).toCharArray();
					Arrays.sort(sub);
					String substr = String.valueOf(sub);
					if (map.containsKey(substr)) {
						map.put(substr, map.get(substr) + 1);
					} else {
						map.put(substr, 1);
					}
				}
			}
			for (Integer integer : map.values()) {
				anagrams += (integer * (integer - 1)) / 2;
			}
			System.out.println(anagrams);
		}
		sc.close();
	}
}
