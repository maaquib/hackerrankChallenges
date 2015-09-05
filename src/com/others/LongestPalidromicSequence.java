package com.others;

public class LongestPalidromicSequence {

	public static void main(String[] args) {
		System.out.println(longestPalin("forgeeksskeegfor"));
	}

	private static String longestPalin(String str) {
		int len = str.length();
		boolean[][] palin = new boolean[len][len];
		for (int i = 0; i < len; i++) {
			palin[i][i] = true;
		}
		int maxLength = 1, startIdx = 0;
		for (int i = 0; i < len - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				palin[i][i + 1] = true;
				maxLength = 2;
				startIdx = i;
			}
		}
		for (int k = 3; k <= len; k++) {
			for (int i = 0; i <= len - k; i++) {
				int j = i + k - 1;
				if (palin[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
					palin[i][j] = true;
					if (k > maxLength) {
						startIdx = i;
						maxLength = k;
					}
				}
			}
		}
		return str.substring(startIdx, startIdx + maxLength);
	}

}
