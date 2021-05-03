package com.epam.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class NextThursdayExample {

	public static void main(String[] args) {
		Supplier<LocalDate> thursdate = NextThursdayExample::getNextThursday;
		LocalDate date = thursdate.get();
		System.out.println(date);
	}
	
	public static LocalDate getNextThursday() {
		LocalDate ld = LocalDate.now();
		ld = ld.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		return ld;
	}
	
}
