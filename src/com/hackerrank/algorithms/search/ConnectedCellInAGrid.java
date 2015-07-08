package com.hackerrank.algorithms.search;

import java.util.Scanner;

public class ConnectedCellInAGrid {
	private static int rows;
	private static int cols;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rows = Integer.parseInt(sc.nextLine());
		cols = Integer.parseInt(sc.nextLine());
		int[][] matrix = new int[rows][cols];
		boolean[][] visited = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			String[] row = sc.nextLine().split("\\s+");
			int j = 0;
			for (String string : row) {
				matrix[i][j] = Integer.parseInt(string);
				j++;
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				max = Math.max(dfsUtil(matrix, visited, i, j, 0), max);
		System.out.println(max);
		sc.close();
	}

	private static int dfsUtil(int[][] matrix, boolean[][] visited, int i, int j, int sum) {
		if (!visited[i][j] && matrix[i][j] == 1) {
			sum++;
			visited[i][j] = true;
			for (int i2 = i - 1; i2 <= i + 1; i2++) {
				for (int j2 = j - 1; j2 <= j + 1; j2++) {
					if (i2 >= 0 && i2 < rows && j2 >= 0 && j2 < cols) {
						if (!visited[i2][j2] && matrix[i2][j2] == 1) {
							sum = dfsUtil(matrix, visited, i2, j2, sum);
						}
					}
				}
			}
		}
		return sum;
	}
}
