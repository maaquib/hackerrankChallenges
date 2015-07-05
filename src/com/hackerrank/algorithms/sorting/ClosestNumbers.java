package com.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> inputArray = new ArrayList<Long>();
		ArrayList<Long> outputArray = new ArrayList<Long>();
		long minDiff = Integer.MAX_VALUE;
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			inputArray.add(sc.nextLong());
		}
		Collections.sort(inputArray);
		for (int i = 0; i < inputArray.size() - 1; i++) {
			if (inputArray.get(i + 1) - inputArray.get(i) < minDiff) {
				outputArray = new ArrayList<Long>();
				outputArray.add(inputArray.get(i));
				outputArray.add(inputArray.get(i + 1));
				minDiff = inputArray.get(i + 1) - inputArray.get(i);
			} else if (inputArray.get(i + 1) - inputArray.get(i) == minDiff) {
				outputArray.add(inputArray.get(i));
				outputArray.add(inputArray.get(i + 1));
			}
		}
		for (Long nums : outputArray) {
			System.out.print(nums + " ");
		}
		sc.close();
	}
}
