package com.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String timeInput = sc.next();
		int hour = Integer.parseInt(timeInput.substring(0, 2));
		String timeRest = timeInput.substring(2, 8);
		if (timeInput.charAt(8) == 'P') {
			timeRest = hour != 12 ? (hour + 12) + timeRest : hour + timeRest;
		} else {
			timeRest = hour == 12 ? "00" + timeRest : timeInput.substring(0, 8);
		}
		System.out.println(timeRest);
		sc.close();
	}
}
