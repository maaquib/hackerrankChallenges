package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CavityMap {
	private static int dimension;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dimension = Integer.parseInt(sc.nextLine().trim());
		int[][] matrix = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			char[] line = sc.nextLine().toCharArray();
			for (int j = 0; j < dimension; j++) {
				matrix[i][j] = Character.getNumericValue(line[j]);
			}
		}
		boolean[][] cavities = new boolean[dimension][dimension];
		for (int i = 1; i < dimension - 1; i++) {
			for (int j = 1; j < dimension - 1; j++) {
				if (matrix[i][j] > matrix[i - 1][j]
						&& matrix[i][j] > matrix[i + 1][j]
								&& matrix[i][j] > matrix[i][j + 1]
										&& matrix[i][j] > matrix[i][j - 1]) {
					cavities[i][j] = true;
				}
			}
		}
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				if (cavities[i][j]) {
					System.out.print("X");
				} else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
