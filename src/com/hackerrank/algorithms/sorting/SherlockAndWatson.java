package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class SherlockAndWatson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().trim().split("\\s+");
		int arr = Integer.parseInt(line[0]);
		int rotations = Integer.parseInt(line[1]);
		rotations = rotations % arr;
		int queries = Integer.parseInt(line[2]);

		int[] array = new int[arr];
		line = sc.nextLine().trim().split("\\s+");
		for (int i = 0; i < arr; i++) {
			array[i] = Integer.parseInt(line[i]);
		}
		for (int i = 0; i < queries; i++) {
			line = sc.nextLine().trim().split("\\s+");
			int query = Integer.parseInt(line[0]);
			if (query - rotations >= 0) {
				query = query - rotations;
			} else {
				query = arr - (rotations - query);
			}
			System.out.println(array[query]);
		}
		sc.close();
	}
}
