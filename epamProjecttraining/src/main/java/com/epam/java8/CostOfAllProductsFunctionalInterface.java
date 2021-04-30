package com.epam.java8;

import java.util.List;

public class CostOfAllProductsFunctionalInterface extends ProductList {

	public static void main(String[] args) {
		List<Product> listOfProducts = getProductList();

		ICalculateCostofProducts calculateCostofallProducts = new ICalculateCostofProducts() {

			@Override
			public double calculate(List<Product> prodList) {
				// TODO Auto-generated method stub
				return listOfProducts.stream().mapToDouble(x -> x.getProdPrice()).sum();
			}
		};

		System.out.println(calculateCostofallProducts.calculate(listOfProducts));

	}
}
