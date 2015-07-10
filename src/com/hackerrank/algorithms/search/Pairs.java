package com.hackerrank.algorithms.search;

import java.util.Scanner;
import java.util.TreeSet;

public class Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("\\s+");
		int cases = Integer.parseInt(line[0]), count = 0;
		long diff = Long.parseLong(line[1]);
		TreeSet<Long> inpList = new TreeSet<>();
		line = sc.nextLine().split("\\s+");
		for (int i = 0; i < cases; i++) {
			inpList.add(Long.parseLong(line[i]));
		}
		for (Long num : inpList) {
			if (inpList.contains(num + diff)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
