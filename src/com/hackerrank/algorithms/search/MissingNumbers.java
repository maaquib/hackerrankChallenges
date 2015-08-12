package com.hackerrank.algorithms.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = sc.nextInt();
		HashMap<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < count1; i++) {
			int item = sc.nextInt();
			if (map1.containsKey(item)) {
				map1.replace(item, map1.get(item) + 1);
			} else {
				map1.put(item, 1);
			}
		}
		int count2 = sc.nextInt();
		for (int i = 0; i < count2; i++) {
			int item = sc.nextInt();
			if (map1.containsKey(item)) {
				map1.replace(item, map1.get(item) - 1);
			} else {
				map1.put(item, 1);
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i : map1.keySet()) {
			if (map1.get(i) != 0) {
				result.add(i);
			}
		}
		Collections.sort(result);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
		sc.close();
	}

}
