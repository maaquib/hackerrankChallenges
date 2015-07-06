package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line1 = sc.nextLine().split("\\s+");
		int cases = Integer.parseInt(line1[0]);
		int topics = Integer.parseInt(line1[1]);
		ArrayList<String> inputStrings = new ArrayList<>();
		for (int i = 0; i < cases; i++) {
			inputStrings.add(sc.nextLine());
		}
		int maxTopicsKnown = Integer.MIN_VALUE;
		int teams = 0;
		for (int i = 0; i < inputStrings.size() - 1; i++) {
			for (int j = i + 1; j < inputStrings.size(); j++) {
				int topicsKnown = 0;
				for (int j2 = 0; j2 < topics; j2++) {
					if (inputStrings.get(i).charAt(j2) == '1' || inputStrings.get(j).charAt(j2) == '1') {
						topicsKnown++;
					}
				}
				if (topicsKnown > maxTopicsKnown) {
					maxTopicsKnown = topicsKnown;
					teams = 1;
				} else if (topicsKnown == maxTopicsKnown) {
					teams++;
				}
			}
		}
		System.out.println(maxTopicsKnown + " " + teams);
		sc.close();
	}
}
