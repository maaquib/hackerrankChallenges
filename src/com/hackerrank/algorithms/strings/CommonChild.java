package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CommonChild {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str1 = sc.nextLine().trim().toCharArray();
		char[] str2 = sc.nextLine().trim().toCharArray();
		System.out.println(buildLCS(str1, str2));
		sc.close();
	}

	private static int buildLCS(char[] str1, char[] str2) {
		int[][] lcsMatrix = new int[str1.length + 1][str2.length + 1];
		for (int i = 0; i < str1.length; i++) {
			lcsMatrix[i][0] = 0;
			lcsMatrix[0][i] = 0;
		}
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i] == str2[j]) {
					lcsMatrix[i + 1][j + 1] = lcsMatrix[i][j] + 1;
				} else {
					lcsMatrix[i + 1][j + 1] = Math.max(lcsMatrix[i][j + 1], lcsMatrix[i + 1][j]);
				}
			}
		}
		return lcsMatrix[str1.length][str2.length];
	}

}
