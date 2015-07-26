package com.hackerrank.magic_lines_july_2015;

import java.util.Scanner;

public class Magic1 {

	public static void bubble_sort(int[] a, int n) {
		int i, t, s = 1;
		while (true) {
			if (s == 0)
				break;
			s = 0;
			for (i = 1; i < n; i++) {
				if (a[i] < a[i - 1]) {
					t = a[i];
					a[i] = a[i - 1];
					a[i - 1] = t;
					s = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n;
		n = scan.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			list[i] = x;
		}
		bubble_sort(list, n);
		for (int i = 0; i < n; i++)
			System.out.println(list[i]);

	}
}
