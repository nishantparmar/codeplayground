package com.nishant.main;

public class Recursion {

	public static void main(String[] args) {
		String input = "hello";
		
		System.out.println(reverseString(input));

	}

	private static String reverseString(String input) {
		if(input.isEmpty()) {
			return input;
		}
		return reverseString(input.substring(1)) + input.charAt(0);
	}

}
