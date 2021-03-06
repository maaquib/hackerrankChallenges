package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		int[] array = new int[size];
		String line = sc.nextLine();
		int i = 0, out = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
				out++;
			}
			array[i + 1] = key;
		}
		System.out.println(out);
		sc.close();
	}
}
