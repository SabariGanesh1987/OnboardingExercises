package com.epam.java8;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateOTP_Supplier {

	public static void main(String[] args) {
		System.out.println(genrateOTP(5).get());
	}

	public static Supplier<String> genrateOTP(final int lengthOfOTP) {
		return () -> {
			StringBuilder otp = new StringBuilder();
			Random random = new Random();

			for (int i = 0; i < lengthOfOTP; i++) {
				int randomNumber = random.nextInt(9);
				otp.append(randomNumber);
			}
			return otp.toString();
		};
	}
}
