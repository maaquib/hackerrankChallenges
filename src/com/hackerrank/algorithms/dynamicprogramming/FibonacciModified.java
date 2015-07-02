package com.hackerrank.algorithms.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("\\s+");
		System.out.println(modFib(new BigInteger(line[0]), new BigInteger(
				line[1]), Integer.parseInt(line[2]) - 2));
		sc.close();
	}

	private static BigInteger modFib(BigInteger a, BigInteger b, int n) {
		if (n == 0) {
			return b;
		} else {
			return modFib(b, a.add(b.pow(2)), --n);
		}
	}
}
