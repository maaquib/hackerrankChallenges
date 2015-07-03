package com.hackerrank.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigInteger factorial = BigInteger.ONE;
		while (num > 0) {
			factorial = factorial
					.multiply(new BigInteger(String.valueOf(num--)));
		}
		System.out.println(factorial);
		sc.close();
	}
}
