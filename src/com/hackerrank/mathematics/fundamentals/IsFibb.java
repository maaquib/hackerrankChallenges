package com.hackerrank.mathematics.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class IsFibb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		ArrayList<String> out = new ArrayList<String>();
		ArrayList<Double> fibList = new ArrayList<Double>();
		fibList.add(1D);
		fibList.add(1D);
		for (int i = 0; i < max; i++) {
			double num = scan.nextDouble();
			while (fibList.get(fibList.size() - 1) < num) {
				fibList.add(fibList.get(fibList.size() - 1)
						+ fibList.get(fibList.size() - 2));
			}
			if (fibList.contains(num)) {
				out.add("IsFibo");
			} else {
				out.add("IsNotFibo");
			}
		}
		for (String outNum : out) {
			System.out.println(outNum);
		}
		scan.close();
	}
}
