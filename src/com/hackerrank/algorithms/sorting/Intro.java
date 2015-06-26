package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		int size = Integer.parseInt(sc.nextLine());
		int[] array = new int[size];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] == key) {
				System.out.println(j);
				break;
			}
		}
		sc.close();
	}
}
