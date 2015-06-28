package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int _i = 0; _i < cases; _i++) {
			String str = sc.nextLine();
			int ans = -1, i = 0, j = str.length() - 1;
			while (i < j && str.toCharArray()[i] == str.toCharArray()[j]) {
				i++;
				j--;
			}
			if (i < j) {
				String str1 = str.substring(0, i)
						+ str.substring(i + 1, str.length() - i - 1);
				if (str1.equals(new StringBuilder(str1).reverse().toString())) {
					ans = i;
				}
				String str2 = str.substring(0, j)
						+ str.substring(j + 1, str.length() - j - 1);
				if (str2.equals(new StringBuilder(str2).reverse().toString())) {
					ans = j;
				}
			}
			out.add(ans);
		}
		for (Integer integer : out) {
			System.out.println(integer);
		}
		sc.close();
	}
}
