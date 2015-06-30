package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {

	private static int[] segments;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int cases = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		ArrayList<Integer> out = new ArrayList<Integer>();
		segments = new int[length];
		String[] segmentString = line.split("\\s+");
		for (int i = 0; i < length; i++) {
			segments[i] = Integer.parseInt(segmentString[i]);
		}
		for (int i = 0; i < cases; i++) {
			String[] testCase = sc.nextLine().split("\\s+");
			int start = Integer.parseInt(testCase[0]);
			int end = Integer.parseInt(testCase[1]);
			out.add(getTypeOfVeh(start, end));
		}
		for (Integer integer : out) {
			System.out.println(integer);
		}
		sc.close();
	}

	private static int getTypeOfVeh(int start, int end) {
		int min = 3;
		for (int i = start; i <= end; i++) {
			if (segments[i] < min) {
				min = segments[i];
			}
		}
		return min;
	}
}
