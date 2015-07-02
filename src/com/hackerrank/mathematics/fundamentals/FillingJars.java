package com.hackerrank.mathematics.fundamentals;

import java.util.Scanner;

public class FillingJars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long jars = sc.nextInt();
		long operations = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < operations; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long k = sc.nextInt();
			sum += k * (Math.abs(b - a) + 1);
		}
		System.out.println(sum / jars);
		sc.close();
	}
}
