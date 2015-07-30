package com.hackerrank.algorithms.search;

import java.util.HashMap;
import java.util.Scanner;

public class IceCreamParlor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int money = sc.nextInt();
			int flavours = sc.nextInt();
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < flavours; j++) {
				int cost = sc.nextInt();
				if (map.getOrDefault(money - cost, -1) != -1) {
					System.out.println(map.get(money - cost) + " " + (j + 1));
					sc.next();
					break;
				} else {
					map.put(cost, j + 1);
				}
			}
		}
		sc.close();
	}
}
