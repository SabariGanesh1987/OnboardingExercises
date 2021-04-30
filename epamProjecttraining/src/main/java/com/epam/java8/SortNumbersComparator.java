package com.epam.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersComparator {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(6, 2, 1, 4, 9);
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
	}

}
