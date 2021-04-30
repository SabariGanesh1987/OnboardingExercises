package com.epam.java8;

import java.util.stream.IntStream;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		boolean ispallendrome = IntStream.range(0, str.length() / 2)
				.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		if (ispallendrome) {
			System.out.println(str + " is Pallendrome");
		} else {
			System.out.println(str + " is not Pallendrome");
		}

	}

}
