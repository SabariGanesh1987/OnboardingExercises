package com.epam.java8;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;



public class PrimitiveInterfacesTask {

	public static void main(String[] args) {
		int number_isPrime = 2;
		int num_square = 1;
		int num_Random = 9;

		System.out.println(isPrime(number_isPrime) ? "Given number is Prime" : "Given number is not Prime");
		squareofNumber(num_square);
		printRandom(num_Random);

		
	}
	
	public static boolean isPrime(int number) {
		IntPredicate isprime = i -> number % i == 0;
		return number > 1 && IntStream.range(2, number - 1).noneMatch(isprime);
	}
	
	public static void squareofNumber(int squareNumber) {
		 IntConsumer display = a -> System.out.println(a * a);
		 display.accept(squareNumber);
	}
	
	public static void printRandom(int num) {
		IntSupplier sup = () -> (int) (Math.random() * num);
		System.out.println("Random int below the given number is " + sup.getAsInt());
	}

}
