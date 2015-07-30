package com.hackerrank.magicLinesJulty2015;

import java.util.Scanner;

public class Magic2 {

	public static String encode(String source) {
		StringBuffer dest = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
			int runLength = 1;
			while (i < source.length() - 1
					&& source.charAt(i) == source.charAt(i + 1)) {
				runLength++;
				i++;
			}

			dest.append(source.charAt(i));
			dest.append(runLength);
		}
		return dest.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(encode(s));

	}
}
