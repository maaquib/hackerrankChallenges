package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class TheLongestCommonSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] array1 = new int[N];
		int[] array2 = new int[M];
		for (int i = 0; i < N; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			array2[i] = sc.nextInt();
		}
		int[][] solution = new int[N + 1][M + 1];
		for (int i = 0; i < N + 1; i++) {
			solution[i][0] = 0;
		}
		for (int j = 0; j < M + 1; j++) {
			solution[0][j] = 0;
		}
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				if (array1[i - 1] == array2[j - 1]) {
					solution[i][j] = solution[i - 1][j - 1] + 1;
				} else {
					solution[i][j] = Math.max(solution[i - 1][j],
							solution[i][j - 1]);
				}
			}
		}
		int i = N, j = M;
		StringBuilder result = new StringBuilder();
		while (i > 0 && j > 0) {
			if (array1[i - 1] == array2[j - 1]) {
				result.append(array1[i - 1]);
				j--;
				i--;
			} else {
				if (solution[i][j - 1] > solution[i - 1][j]) {
					j--;
				} else {
					i--;
				}
			}
		}
		for (Character c : result.reverse().toString().toCharArray()) {
			System.out.print(c + " ");
		}
		sc.close();
	}
}
