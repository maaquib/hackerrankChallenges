package com.hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren {
	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException,
	IOException {
		int numPackets = Integer.parseInt(in.readLine());
		int numKids = Integer.parseInt(in.readLine());
		int[] packets = new int[numPackets];

		for (int i = 0; i < numPackets; i++) {
			packets[i] = Integer.parseInt(in.readLine());
		}

		int unfairness = Integer.MAX_VALUE;

		Arrays.sort(packets);

		for (int i = 0; i < packets.length - numKids; i++) {
			if (unfairness > packets[i + numKids - 1] - packets[i]) {
				unfairness = packets[i + numKids - 1] - packets[i];
			}
		}

		System.out.println(unfairness);
	}
}
