package com.epam.java8;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_Random_Prod {

	public static void main(String[] args) {
		Supplier<Product> newProd = () -> new Product(new RandString().RandStr(), new Random().nextDouble(),
				new RandString().RandStr(), new RandString().RandStr());
		System.out.println(newProd.get().getProdName() + " " + newProd.get().getProdPrice() + " "
				+ newProd.get().getProdCategory() + " " + newProd.get().getProdGrade());
	}

}

class RandString {
	public String RandStr() {
		Random random = new Random();
		String generatedString = random.ints(97, 122 + 1).limit(5)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		return generatedString;
	}
}
