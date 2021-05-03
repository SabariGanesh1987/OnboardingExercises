package com.epam.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionTask {

	public static void main(String[] args) {
		BiFunction<String, Double, Product> createProd = (a, b) -> new Product(a, b);
		Product prod1 = createProd.apply("Mobile", 10000.00); //Creating new product using Product name and price.
		System.out.println("Newly created product is " + prod1.getProdName() + " " + prod1.getProdPrice() + " "
				+ prod1.getProdCategory() + " " + prod1.getProdGrade());
		
		Map<String, Double> ProductPrices = new HashMap<String, Double>();
		ProductPrices.put("Mobile", 10000.00);
		ProductPrices.put("Charger", 250.00);
		ProductPrices.put("ScreenGuard", 1200.00);
		ProductPrices.put("BackCase", 99.00);
		
		BiFunction<Double, Integer, Double> CalCost = (a, b) -> (a * b); //Calculating cost of each product (quantity * price).
		Map<String, Integer> cart = new HashMap<String, Integer>();
		cart.put("Mobile", 10);
		cart.put("Charger", 5);
		double totalCartCost = 0.00;
		
		for (Map.Entry<String, Integer> prod : cart.entrySet()) {
			totalCartCost += CalCost.apply(ProductPrices.get(prod.getKey()), prod.getValue());
		}
		System.out.println("Total cost of the cart is " + totalCartCost);


	}

}
