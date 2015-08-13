package com.others;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Before Rotation:");
		print(matrix);
		matrix = rotate(matrix);
		System.out.println();
		print(matrix);
	}

	private static int[][] rotate(int[][] matrix) {
		int len = matrix.length;
		for (int i = 0; i < len / 2; i++) {
			for (int j = 0; j < Math.ceil((double) len / 2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[len - 1 - j][i];
				matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
				matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
				matrix[j][len - 1 - i] = temp;
			}
		}
		return matrix;
	}

	private static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
