package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] sticks = new int[cases];
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < cases; i++) {
			sticks[i] = sc.nextInt();
			smallest = smallest > sticks[i] ? sticks[i] : smallest;
		}
		while (true) {
			int sum = 0, tempSmallest = Integer.MAX_VALUE;
			for (int i = 0; i < sticks.length; i++) {
				if (sticks[i] > smallest) {
					sticks[i] -= smallest;
					tempSmallest = tempSmallest > sticks[i] ? sticks[i]
							: tempSmallest;
					sum++;
				} else if (sticks[i] > 0) {
					sticks[i] = 0;
					sum++;
				} else {
					sticks[i] = 0;
				}
			}
			if (sum == 0) {
				break;
			} else {
				System.out.println(sum);
				smallest = tempSmallest;
			}
		}
		sc.close();
	}
}
