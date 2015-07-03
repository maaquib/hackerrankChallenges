package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cases; i++) {
			String[] line1 = sc.nextLine().split("\\s+");
			long black = Integer.parseInt(line1[0]);
			long white = Integer.parseInt(line1[1]);
			String[] line2 = sc.nextLine().split("\\s+");
			long blackCost = Integer.parseInt(line2[0]);
			long whiteCost = Integer.parseInt(line2[1]);
			long changeCost = Integer.parseInt(line2[2]);
			long costNoChange = black * blackCost + white * whiteCost;
			long allWhite = (black + white) * whiteCost + black * changeCost;
			long allBlack = (black + white) * blackCost + white * changeCost;
			System.out.println(Math.min(costNoChange,
					Math.min(allWhite, allBlack)));
		}
		sc.close();
	}
}
