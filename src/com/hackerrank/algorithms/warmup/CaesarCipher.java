package com.hackerrank.algorithms.warmup;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		char[] lineArray = sc.next().toCharArray();
		int k = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lineArray.length; i++) {
			if (lineArray[i] >= 'a' && lineArray[i] <= 'z') {
				sb.append((char) ((lineArray[i] - 'a' + k) % 26 + 'a'));
			} else if (lineArray[i] >= 'A' && lineArray[i] <= 'Z') {
				sb.append((char) ((lineArray[i] - 'A' + k) % 26 + 'A'));
			} else {
				sb.append(lineArray[i]);
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
