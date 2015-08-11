package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class FindTheMedian {

	private static int[] array;
	private static boolean notFound;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		notFound = true;
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		quickSort(0, array.length - 1);
		if (notFound) {
			System.out.println(array[array.length / 2]);
		}
		sc.close();
	}

	private static void quickSort(int p, int r) {
		if (p < r && notFound) {
			int q = partition(p, r);
			if (q == array.length / 2) {
				System.out.println(array[q]);
				notFound = false;
				return;
			}
			quickSort(p, q - 1);
			quickSort(q + 1, r);
		}
	}

	private static int partition(int start, int end) {
		int pivot = array[end];
		int wall = start - 1;
		for (int j = start; j < end; j++) {
			if (array[j] < pivot) {
				wall++;
				swap(wall, j);
			}
		}
		swap(++wall, end);
		return wall;
	}

	private static void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
