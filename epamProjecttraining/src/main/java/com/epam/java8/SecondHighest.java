package com.epam.java8;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighest {

	public static void main(String[] args) {
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.stream(arr).skip(1).findFirst());

	}

}
