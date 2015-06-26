package com.hackerrank.algorithms.dynamicprogramming;

import java.util.Scanner;

public class TheMaximumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cases; i++) {
			int size = Integer.parseInt(sc.nextLine());
			int[] array = new int[size];
			String line = sc.nextLine();
			int j = 0;
			for (String nums : line.split("\\s+")) {
				array[j] = Integer.parseInt(nums.trim());
				j++;
			}
			System.out.print(findMaxSumContiguous(array, 0, size - 1) + " ");
			int sum = 0, least = array[0];
			for (int j2 = 0; j2 < array.length; j2++) {
				if (array[j2] >= 0)
					sum += array[j2];
				else if (array[j2] > least)
					least = array[j2];
			}
			System.out.println(sum == 0 ? least : sum);
		}
		sc.close();
	}

	private static int findMaxSumContiguous(int[] array, int start, int end) {
		if (start == end)
			return array[start];
		else {
			int mid = (start + end) / 2;
			return Math.max(findMaxSumContiguous(array, start, mid), Math.max(
					findMaxSumContiguous(array, mid + 1, end),
					findMaxCrossSubarray(array, start, mid, end)));
		}
	}

	private static int findMaxCrossSubarray(int[] array, int start, int mid,
			int end) {
		int lSum = Integer.MIN_VALUE, rSum = Integer.MIN_VALUE, sum = 0;
		for (int i = mid; i >= start; i--) {
			sum += array[i];
			if (sum > lSum)
				lSum = sum;
		}
		sum = 0;
		for (int i = mid + 1; i <= end; i++) {
			sum += array[i];
			if (sum > rSum)
				rSum = sum;
		}
		return lSum + rSum;
	}
}
