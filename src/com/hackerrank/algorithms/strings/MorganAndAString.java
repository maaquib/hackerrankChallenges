package com.hackerrank.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MorganAndAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String str1 = sc.nextLine().trim();
			String str2 = sc.nextLine().trim();
			String[] suffix = new String[str1.length() + str2.length()];
			int k = 0;
			for (int j = 0; j < str1.length(); j++, k++) {
				suffix[k] = str1.substring(j);
			}
			for (int j = 0; j < str2.length(); j++, k++) {
				suffix[k] = str2.substring(j);
			}
			Arrays.sort(suffix);
			int first = 0, second = 0;
			StringBuilder sb = new StringBuilder();
			while (first < str1.length() && second < str2.length()) {
				if (str1.charAt(first) < str2.charAt(second)) {
					sb.append(str1.charAt(first));
					first++;
				} else if (str1.charAt(first) > str2.charAt(second)) {
					sb.append(str2.charAt(second));
					second++;
				} else {
					int idx1 = binarySearch(suffix, str1.substring(first + 1));
					int idx2 = binarySearch(suffix, str2.substring(second + 1));
					if (idx2 < idx1) {
						sb.append(str2.charAt(second));
						second++;
					} else {
						sb.append(str1.charAt(first));
						first++;
					}
				}
			}
			if (first < str1.length()) {
				sb.append(str1.substring(first));
			}
			if (second < str2.length()) {
				sb.append(str2.substring(second));
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}

	private static int binarySearch(String[] suffix, String substring) {
		int l = 0, r = suffix.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (substring.equals(suffix[m])) {
				return m;
			} else if (substring.compareTo(suffix[m]) > 0) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return Integer.MAX_VALUE;
	}

}
