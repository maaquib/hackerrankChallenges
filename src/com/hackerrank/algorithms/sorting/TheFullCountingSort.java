package com.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TheFullCountingSort {

	private static int[] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		array = new int[size];
		int[] countArray = new int[100];
		int[] sortedArray = new int[size];
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> tempList = new ArrayList<String>();
		for (int j = 0; j < size; j++) {
			String[] line = sc.nextLine().split("\\s+");
			int key = Integer.parseInt(line[0]);
			array[j] = key;
			if (map.containsKey(key)) {
				tempList = map.get(key);
				tempList.add(j >= size / 2 ? line[1] : "-");
				map.replace(key, tempList);
			} else {
				tempList = new ArrayList<String>();
				tempList.add(j >= size / 2 ? line[1] : "-");
				map.put(key, tempList);
			}
		}
		for (int j = 0; j < array.length; j++) {
			countArray[array[j]]++;
		}
		for (int j = 1; j < countArray.length; j++) {
			countArray[j] += countArray[j - 1];
		}
		for (int j = array.length - 1; j >= 0; j--) {
			sortedArray[countArray[array[j]] - 1] = array[j];
			countArray[array[j]] -= 1;
		}
		int prev = Integer.MIN_VALUE;
		StringBuilder sb = new StringBuilder();
		for (int j : sortedArray) {
			if (prev != j) {
				tempList = map.get(j);
				for (String string : tempList) {
					sb.append(string + " ");
				}
				prev = j;
			}
		}
		System.out.print(sb.toString());
		sc.close();
	}
}
