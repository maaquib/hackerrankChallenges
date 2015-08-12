package com.hackerrank.algorithms.sorting;

import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int size = sc.nextInt();
			long result = 0;
			HashMap<Integer, Long> map = new HashMap<>();
			for (int j = 0; j < size; j++) {
				int key = sc.nextInt();
				if (map.containsKey(key)) {
					map.replace(key, map.get(key) + 1);
				} else {
					map.put(key, 1L);
				}
			}
			for (Integer key : map.keySet()) {
				if (map.get(key) > 1) {
					result += ((map.get(key) - 1) * map.get(key));
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
