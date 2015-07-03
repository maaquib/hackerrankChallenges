package com.hackerrank.algorithms.implementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheGridSearch {
	private static String[] largeArray, smallArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int xDimL = sc.nextInt();
			sc.nextInt();
			sc.nextLine();
			largeArray = new String[xDimL];
			for (int j1 = 0; j1 < xDimL; j1++) {
				largeArray[j1] = sc.nextLine();
			}
			int xDimS = sc.nextInt();
			sc.nextInt();
			sc.nextLine();
			smallArray = new String[xDimS];
			for (int j1 = 0; j1 < xDimS; j1++) {
				smallArray[j1] = sc.nextLine();
			}
			System.out.println(checkContains(0, 0, Integer.MIN_VALUE) ? "YES"
					: "NO");
		}
		sc.close();
	}

	private static boolean checkContains(int largeIdx, int smallIdx, int yIdx) {
		if (largeArray[largeIdx].contains(smallArray[smallIdx])) {
			if (yIdx > 0) {
				if (largeArray[largeIdx].toCharArray()[yIdx] == smallArray[smallIdx]
						.toCharArray()[0]) {
					if (smallIdx == smallArray.length - 1) {
						return true;
					} else {
						return checkContains(++largeIdx, ++smallIdx, yIdx);
					}
				} else {
					return false;
				}
			} else {
				Pattern pattern = Pattern.compile(smallArray[smallIdx]);
				Matcher matcher = pattern.matcher(largeArray[largeIdx]);
				if (matcher.find()) {
					yIdx = matcher.start();
					return checkContains(++largeIdx, ++smallIdx, yIdx);
				} else {
					return false;
				}
			}
		} else {
			if (largeIdx < largeArray.length - smallArray.length) {
				return checkContains(++largeIdx, smallIdx, yIdx);
			} else {
				return false;
			}
		}
	}
}
