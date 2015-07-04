package com.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfQuicksort {

	private static int[] array;
	private static int quick = 0;
	private static int insert = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		int[] originalArray = new int[size];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		System.arraycopy(array, 0, originalArray, 0, array.length);
		quickSort(0, array.length - 1);
		for (int j = 1; j < originalArray.length; j++) {
			int key = originalArray[j];
			i = j - 1;
			while (i >= 0 && originalArray[i] > key) {
				originalArray[i + 1] = originalArray[i];
				i--;
				insert++;
			}
			originalArray[i + 1] = key;
		}
		System.out.println(insert - quick);
		sc.close();
	}

	private static void quickSort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quickSort(p, q - 1);
			quickSort(q + 1, r);
		}
	}

	private static int partition(int start, int end) {
		int pivot = array[end];
		int wall = start - 1;
		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
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
		quick++;
	}
}
