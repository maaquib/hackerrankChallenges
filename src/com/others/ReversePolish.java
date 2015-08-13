package com.others;

import java.util.Stack;

/**
 * Process arithmetic reverse polish expression
 * 
 * @author aaqib
 *
 */
public class ReversePolish {

	public static void main(String[] args) {
		System.out.println(process(new String[] { "2", "1", "+", "3", "*" }));
		System.out.println(process(new String[] { "4", "13", "5", "/", "+" }));
	}

	public static String process(String[] array) {
		int i = 2;
		Stack<String> stack = new Stack<>();
		stack.push(array[0]);
		stack.push(array[1]);
		while (i < array.length) {
			double a, b;
			if ("+-/*".contains(array[i])) {
				switch (array[i]) {
				case "+":
					stack.push(String.valueOf(Double.parseDouble(stack.pop()) + Double.parseDouble(stack.pop())));
					break;
				case "-":
					a = Double.parseDouble(stack.pop());
					b = Double.parseDouble(stack.pop());
					stack.push(String.valueOf(b - a));
					break;
				case "/":
					a = Double.parseDouble(stack.pop());
					b = Double.parseDouble(stack.pop());
					stack.push(String.valueOf(b / a));
					break;
				case "*":
					stack.push(String.valueOf(Double.parseDouble(stack.pop()) * Double.parseDouble(stack.pop())));
					break;
				}
			} else {
				stack.push(array[i]);
			}
			i++;
		}
		return stack.peek();
	}
}
