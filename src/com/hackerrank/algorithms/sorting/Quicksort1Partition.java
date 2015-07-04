package com.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Quicksort1Partition {
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
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		int pivot = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] <= pivot) {
				temp1.add(array[j]);
			} else {
				temp2.add(array[j]);
			}
		}
		temp1.add(pivot);
		temp1.addAll(temp2);
		printArray(temp1);
		sc.close();
	}

	private static void printArray(ArrayList<Integer> array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
