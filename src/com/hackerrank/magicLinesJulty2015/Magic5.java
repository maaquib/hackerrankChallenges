package com.hackerrank.magic_lines_july_2015;

import java.util.Scanner;

class point {
	long x, y;

	point() {
		x = 0;
		y = 0;
	}

	point(long _x, long _y) {
		x = _x;
		y = _y;
	}
};

public class Magic5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int i;
		point[] points = new point[100002];

		num = sc.nextInt();

		point hold = new point();

		for (i = 0; i < num; ++i) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			points[i] = new point(x, y);
		}
		double ave_x = 0, ave_y = 0;

		for (i = 0; i < num; i++) {
			ave_x += points[i].x;
			ave_y += points[i].y;

		}
		ave_x /= num;
		ave_y /= num;

		double diff_x, diff_y;

		diff_x = points[0].x - ave_x;
		diff_y = points[0].y - ave_y;

		int best = 0;
		double best_dist = Math.pow(diff_x, 2) + Math.pow(diff_y, 2);

		double hold_dist;

		for (i = 1; i < num; ++i) {
			diff_x = points[i].x - ave_x;
			diff_y = points[i].y - ave_y;

			hold_dist = Math.pow(diff_x, 2) + Math.pow(diff_y, 2);

			if (hold_dist < best_dist) {
				best_dist = hold_dist;
				best = i;
			}
		}

		point best_pt = points[best];

		long total_dist = 0;

		for (i = 0; i < num; ++i) {
			diff_x = Math.abs(points[i].x - best_pt.x);
			diff_y = Math.abs(points[i].y - best_pt.y);

			total_dist += diff_x == 0 ? diff_y : (diff_y == 0 ? diff_x : Math.max(diff_x, diff_y));
		}
		System.out.println(total_dist);

	}

}
