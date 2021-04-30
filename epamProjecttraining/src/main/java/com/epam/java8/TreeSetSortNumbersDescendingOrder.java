package com.epam.java8;

import java.util.TreeSet;

public class TreeSetSortNumbersDescendingOrder {

	public static void main(String[] args) {

		TreeSet<Object> numbers = new TreeSet<Object>();
        numbers.add(2);
        numbers.add(20);
        numbers.add(10);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        
        TreeSet<Object> descendentSet = (TreeSet<Object>) numbers.descendingSet();
        System.out.println("Descending Set:::"+descendentSet);
	}

}
