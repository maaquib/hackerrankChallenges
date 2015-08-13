package com.others;

/**
 * Edit distance between two strings (Dynamic Programming)
 * 
 * @author aaqib
 *
 */
public class EditDistance {

	public static void main(String[] args) {
		System.out.println(editDistance("abde".toCharArray(), "abce".toCharArray()));
	}

	public static int editDistance(char[] str1, char[] str2) {
		int[][] matrix = new int[str1.length + 1][str2.length + 1];

		for (int i = 0; i <= str1.length; i++) {
			matrix[i][0] = i;
		}
		for (int j = 0; j <= str2.length; j++) {
			matrix[0][j] = j;
		}
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i] == str2[j]) {
					matrix[i + 1][j + 1] = matrix[i][j];
				} else {
					int min = Math.min(matrix[i][j + 1], Math.min(matrix[i + 1][j], matrix[i][j]));
					matrix[i + 1][j + 1] = min + 1;
				}
			}
		}
		return matrix[str1.length][str2.length];
	}
}
