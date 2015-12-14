package com.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort2Sorting {

	private static int[] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		String line = sc.nextLine();
		int i = 0;
		for (String nums : line.split("\\s+")) {
			array[i] = Integer.parseInt(nums.trim());
			i++;
		}
		quickSort(0, array.length - 1);
		sc.close();
	}

	private static void quickSort(int p, int r) {
		if (p < r) {
			int q = partition(p, r);
			quickSort(p, q - 1);
			quickSort(q + 1, r);
			printArray(p, r);
		}
	}

	private static int partition(int start, int end) {
		int pivot = array[start];
		ArrayList<Integer> lower = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		for (int i = start + 1; i <= end; i++) {
			if (array[i] <= pivot) {
				lower.add(array[i]);
			} else {
				greater.add(array[i]);
			}
		}
		int i = start;
		for (Integer elem : lower) {
			array[i++] = elem;
		}
		int wall = i;
		array[i++] = pivot;
		for (Integer elem : greater) {
			array[i++] = elem;
		}
		return wall;
	}

	private static void printArray(int i, int j) {
		for (int k = i; k <= j; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println();
	}
}
