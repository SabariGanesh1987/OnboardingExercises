package com.epam.java8;

import java.util.TreeSet;

public class TreeSetReverseNames {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("one");
		ts.add("two");
		ts.add("three");
		ts.add("four");
		ts.add("five");
		System.out.println("Reverse order is: " + ts.descendingSet());

	}

}
