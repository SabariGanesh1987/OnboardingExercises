package com.epam.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseSortLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>
		(Arrays.asList
				(new Person("John"), 
						new Person("Sam"), 
						new Person("Will"),
						new Person("Dan"), 
						new Person("Joe")));

		Comparator<Person> byName = Comparator.comparing(Person::getName).reversed();
		Collections.sort(persons, byName);
		System.out.println(persons);
	}

}
