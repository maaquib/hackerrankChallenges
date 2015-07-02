package com.hackerrank.algorithms.bitmanipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		ArrayList<Integer> in = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < testCases; i++) {
			int num = sc.nextInt();
			if (in.contains(num) && !temp.contains(num)) {
				temp.add(num);
			} else {
				in.add(num);
			}
		}
		in.removeAll(temp);
		for (Integer max : in) {
			System.out.println(max);
		}
		sc.close();
	}
}
