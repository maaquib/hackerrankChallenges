package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		int rows = (int) Math.floor(Math.sqrt(input.length()));
		int cols = (int) Math.ceil(Math.sqrt(input.length()));
		while (rows * cols < input.length()) {
			rows++;
		}
		String[][] matrix = new String[rows][cols];
		int idx = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (idx < input.length()) {
					matrix[i][j] = String.valueOf(input.toCharArray()[idx]);
				} else {
					matrix[i][j] = null;
				}
				idx++;
			}
		}
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				if (matrix[j][i] != null)
					System.out.print(matrix[j][i]);
			}
			System.out.print(" ");
		}
		sc.close();
	}
}
