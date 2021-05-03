package com.epam.java8;

import java.time.LocalDate;
import java.util.function.Predicate;

public class YesterdaysDate {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		String yerter = yesterday.toString();
		String date = "2021-05-02";
		Predicate<String> dateCheck = new Predicate<String>() {
			@Override
			public boolean test(String dates) {
				if (dates.equals(yerter))
					return true;
				else
					return false;
			}
		};
		System.out.println(dateCheck.test(date));
	}

}
