package com.epam.java8;

import java.util.ArrayList;
import java.util.Collections;

public class SortByNameComparator {

	public static void main(String[] args) {
		ArrayList<String> employees = new ArrayList<String>();
		employees.add("John");
		employees.add("Adam");
		employees.add("Carl");
		employees.add("Ben");

		Collections.sort(employees, (p1, p2) -> {
			return p1.compareTo(p2);
		});

		for (String employee : employees) {
			System.out.println(employee);
		}
	}
}
